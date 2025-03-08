package br.pro.delfino.drogaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import br.pro.delfino.drogaria.domain.Categoria;
import br.pro.delfino.drogaria.exception.CategoriaInvalidaException;
import br.pro.delfino.drogaria.exception.CategoriaNaoEncontradaException;
import br.pro.delfino.drogaria.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscarPorCodigo(Byte codigo) {
		return this.categoriaRepository.findById(codigo).orElseThrow(
				() -> new CategoriaNaoEncontradaException("Categoria não encontrada para o código: " + codigo));
	}

	public List<Categoria> listar() {
		return Optional.of(this.categoriaRepository.findAll()).filter(list -> !list.isEmpty())
				.orElseThrow(() -> new CategoriaNaoEncontradaException("Nenhuma categoria encontrada."));
	}

	public Categoria inserir(Categoria categoria) {
		Optional.ofNullable(categoria.getName()).filter(name -> !name.trim().isEmpty())
				.orElseThrow(() -> new CategoriaInvalidaException("O nome da categoria não pode ser vazio."));
		return this.categoriaRepository.save(categoria);
	}

	public Categoria excluir(Byte codigo) {
		return this.categoriaRepository.findById(codigo).map(categoria -> {
			this.categoriaRepository.delete(categoria);
			return categoria;
		}).orElseThrow(() -> new CategoriaNaoEncontradaException("Categoria não encontrada para o código: " + codigo));
	}

	public Categoria editar(Categoria categoria) {
		Optional.ofNullable(categoria.getCodigo()).orElseThrow(
				() -> new DataIntegrityViolationException("O código da categoria é obrigatório para edição."));
		Optional.ofNullable(categoria.getName()).filter(name -> !name.trim().isEmpty())
				.orElseThrow(() -> new DataIntegrityViolationException("O nome da categoria não pode ser vazio."));
		return this.categoriaRepository.save(categoria);
	}
}
