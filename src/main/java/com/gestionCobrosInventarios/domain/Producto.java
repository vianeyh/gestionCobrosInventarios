package com.gestionCobrosInventarios.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="Producto")
public class Producto {
	
	@Id
	private String id;
	private String prducto;
	private String tipo;
	private String color;
	private String talla;
	private String email;
	private String rfc;
	private String status; 
	private String codigo;

}