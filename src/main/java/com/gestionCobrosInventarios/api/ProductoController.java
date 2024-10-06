package com.gestionCobrosInventarios.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestionCobrosInventarios.domain.Producto;
import com.gestionCobrosInventarios.dto.RegistroProductoRequest;
import com.gestionCobrosInventarios.service.ProductoService;

@RestController
public class ProductoController implements ProductoApi {

	@Autowired
	private ProductoService productoService;
	
	@Override
	public Producto registrarProducto(
			RegistroProductoRequest request) {
		return productoService.registrarProducto(
			request.getProducto());
	}

}