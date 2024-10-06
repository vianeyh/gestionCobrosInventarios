package com.gestionCobrosInventarios.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gestionCobrosInventarios.domain.Producto;
import java.util.List;


public interface ProductoRepository 
	extends MongoRepository<Producto, String>{
	
	Optional<Producto> findByCodigo(String codigo);;

}
