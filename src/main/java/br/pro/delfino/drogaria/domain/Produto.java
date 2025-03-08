package br.pro.delfino.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
	@Column(nullable = false)
	private Byte quantidade;
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal preco;
	@Column
	private LocalDate dataDeValidade;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Short codigo, String nome, Byte quantidade, BigDecimal preco, LocalDate dataDeValidade,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataDeValidade = dataDeValidade;
		this.categoria = categoria;
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Byte getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Byte quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", dataDeValidade=" + dataDeValidade + ", categoria=" + categoria + "]";
	}
}
