package com.trupper.carrito.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "lista_compra_detalle")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@MappedSuperclass
//@IdClass(ListaCompraDetallePK.class)
public class ListaCompraDetalle /*extends ListaCompraDetallePK */implements Serializable {

	//@Id
	@EmbeddedId
	private ListaCompraDetallePK idListaCompraDetallePK;
	
	private int cantidad;
	
	private boolean activo;
	
	//public ListaCompraDetalle(Long idListaCompra, Long idProducto) {
		//this.idListaCompraDetallePK = new ListaCompraDetallePK(this.idListaCompra, this.idProducto);
		//this.idListaCompra = idListaCompra;
		//this.idProducto = idProducto;
	//}

	@PrePersist
	public void prePersist() {
		this.activo = true;
	}
	
}
