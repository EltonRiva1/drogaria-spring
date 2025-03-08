package br.pro.delfino.drogaria.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Byte codigo;
	@Column(length = 50, nullable = false, unique = true)
	private String name;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Byte codigo, String name) {
		super();
		this.codigo = codigo;
		this.name = name;
	}

	public Byte getCodigo() {
		return codigo;
	}

	public void setCodigo(Byte codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Categoria other = (Categoria) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", name=" + name + "]";
	}
}
