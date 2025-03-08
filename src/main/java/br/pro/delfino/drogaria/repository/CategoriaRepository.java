package br.pro.delfino.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.delfino.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Byte> {

}
