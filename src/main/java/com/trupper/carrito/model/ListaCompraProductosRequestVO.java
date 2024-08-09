package com.trupper.carrito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListaCompraProductosRequestVO {

	private Long idProducto;
	private int cantidad;
	
}
