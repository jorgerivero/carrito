package com.trupper.carrito.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ListaCompraDetalleRequestVO implements Serializable {

	private Long idCliente;
	private String nombreLista;
	
	public List<ListaCompraProductosRequestVO> ListaCompraProductosVO;
	
	private Long idProducto; 
	private int cantidad;
	
}
