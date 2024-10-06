package com.gestionCobrosInventarios.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionCobrosInventarios.domain.Producto;
import com.gestionCobrosInventarios.domain.ProductoAlreadyExistsException;
import com.gestionCobrosInventarios.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository usuarioRepository;
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(ProductoServiceImpl.class);

	@Override
	public Producto registrarProducto(Producto producto) {
		// validacion producto existente
		Optional<Producto> productoExistente = 
				usuarioRepository.findByCodigo(producto.getCodigo());
		if (productoExistente.isPresent()) {
			throw new ProductoAlreadyExistsException(producto.getCodigo());
		}
		
		// guardar usuario
	 
		usuarioRepository.save(producto);
		LOG.info("Usuario Registrado: " + producto);
		
		return producto;
	}

}
