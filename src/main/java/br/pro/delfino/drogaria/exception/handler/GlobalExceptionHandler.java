package br.pro.delfino.drogaria.exception.handler;

import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.pro.delfino.drogaria.exception.CategoriaInvalidaException;
import br.pro.delfino.drogaria.exception.CategoriaNaoEncontradaException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(CategoriaNaoEncontradaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> handleCategoriaNaoEncontradaException(
			CategoriaNaoEncontradaException categoriaNaoEncontradaException) {
		return Map.of("error", categoriaNaoEncontradaException.getMessage());
	}

	@ExceptionHandler(CategoriaInvalidaException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> handleCategoriaInvalidaException(CategoriaInvalidaException categoriaInvalidaException) {
		return Map.of("error", categoriaInvalidaException.getMessage());
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> handleDataIntegrityViolationException(
			DataIntegrityViolationException dataIntegrityViolationException) {
		if (dataIntegrityViolationException.getMessage().contains("UK3e0tujpquovd6riu99drouuvh")) {
			return Map.of("error", "Já existe uma categoria com esse nome.");
		}
		return Map.of("error", "Erro de integridade dos dados.");
	}
}
