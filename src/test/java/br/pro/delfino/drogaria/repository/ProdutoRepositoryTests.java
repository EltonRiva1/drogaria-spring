package br.pro.delfino.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.pro.delfino.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;

	@Test
	public void inserir() {
		Produto p1 = new Produto(null, "Coca-Cola", Byte.valueOf("15"), BigDecimal.valueOf(10.50),
				LocalDate.of(2021, 11, 23), null);
		Produto p2 = new Produto(null, "Heineken", Byte.valueOf("23"), BigDecimal.valueOf(8.00),
				LocalDate.of(2022, 4, 1), null);
		this.produtoRepository.save(p1);
		this.produtoRepository.save(p2);
	}
}
