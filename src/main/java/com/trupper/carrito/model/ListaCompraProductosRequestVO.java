package com.trupper.carrito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ListaCompraProductosRequestVO {

	private Long idProducto;
	private int cantidad;
	
}
