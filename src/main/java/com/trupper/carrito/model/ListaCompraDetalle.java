package com.trupper.carrito.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
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
	private ListaCompraDetallePK idListaCompraDetallePK;;
	
	//private String idCodigoProducto;
	private String nombre;
	
	@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
	private LocalDateTime fechaRegistro;
	
	@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
	private LocalDateTime fechaUltimaActualizacion;
	
	private int cantidad;
	
	private boolean activo;
	
	//public ListaCompraDetalle(Long idListaCompra, Long idProducto) {
		//this.idListaCompraDetallePK = new ListaCompraDetallePK(this.idListaCompra, this.idProducto);
		//this.idListaCompra = idListaCompra;
		//this.idProducto = idProducto;
	//}
	
}
