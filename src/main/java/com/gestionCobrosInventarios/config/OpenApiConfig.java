package com.gestionCobrosInventarios.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "Registro de Inventario sucursales Bavi Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "la gestión de compra y venta de productos en sucursales Bavi", 
			contact = @Contact(
				name = "Bavi" ,
				url = "https://www.facebook.com/BoutiqueMaluany",
			email = "modaszabdizabdi@gmail.com")))
public class OpenApiConfig {

}
