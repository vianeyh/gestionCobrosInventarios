package com.gestionCobrosInventarios.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.gestionCobrosInventarios.domain.Producto;

@Data
@NoArgsConstructor
public class RegistroProductoRequest {
	
	@NotNull
	@Valid
	private Producto producto;

}