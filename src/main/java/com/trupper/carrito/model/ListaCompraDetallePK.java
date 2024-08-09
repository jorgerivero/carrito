package com.trupper.carrito.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ListaCompraDetallePK implements Serializable{

	//@Id
	public Long idListaCompra;
	
	//@Id
	public Long idProducto;
	
	public ListaCompraDetallePK( ) {
		
	}
			
	public ListaCompraDetallePK(Long idListaCompra, Long idProducto) {
		this.idListaCompra = idListaCompra;
		this.idProducto = idProducto;
	}
	
}
