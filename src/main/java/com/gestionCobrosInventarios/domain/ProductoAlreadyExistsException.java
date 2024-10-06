package com.gestionCobrosInventarios.domain;

public class ProductoAlreadyExistsException extends RuntimeException {
	
	public ProductoAlreadyExistsException(String codigo) {
		super("Ya existe un producto registrado con el código: " + codigo);
	}

}
