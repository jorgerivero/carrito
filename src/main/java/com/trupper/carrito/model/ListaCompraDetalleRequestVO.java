package com.trupper.carrito.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListaCompraDetalleRequestVO implements Serializable {

	private Long clienteId;
	private String nombreLista;
	
	public List<ListaCompraProductosRequestVO> ListaCompraProductosVO;
	
	private Long idProducto; 
	private int cantidad;
	
}
