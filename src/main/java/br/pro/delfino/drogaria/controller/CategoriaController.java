package br.pro.delfino.drogaria.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pro.delfino.drogaria.domain.Categoria;
import br.pro.delfino.drogaria.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping
	public List<Categoria> listar() {
		return this.categoriaService.listar();
	}

	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		return this.categoriaService.inserir(categoria);
	}

	@DeleteMapping("{codigo}")
	public Categoria excluir(@PathVariable("codigo") Byte codigo) {
		return this.categoriaService.excluir(codigo);
	}

	@PutMapping
	public Categoria editar(@RequestBody Categoria categoria) {
		return this.categoriaService.editar(categoria);
	}

	@GetMapping("{codigo}")
	public Categoria buscarPorCodigo(@PathVariable("codigo") Byte codigo) {
		return this.categoriaService.buscarPorCodigo(codigo);
	}
}
