package com.gestionCobrosInventarios.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gestionCobrosInventarios.domain.Estado;

public interface EstadoRepository 
	extends MongoRepository<Estado, String>{

}
