package com.gestionCobrosInventarios.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="estado")
public class Estado {
	
	@Id
	private String id;
	private String status;
}
