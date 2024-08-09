package com.trupper.carrito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ListaCompraProductosRequestVO implements Serializable {

	private Long idProducto;
	private int cantidad;
	private String descripcion;
	private boolean activo;
	
}
