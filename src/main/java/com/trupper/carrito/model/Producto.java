package com.trupper.carrito.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Producto {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	
	private String clave;
	private String descripcion;
	private boolean activo;
	
	//@OneToMany(mappedBy = "idListaCompra", fetch = FetchType.LAZY, orphanRemoval = true)
	//private List<ListaCompraDetalle> listaCompraProductoDetalle;

	@PrePersist
	public void prePersist() {
		this.activo = true;
	}
}
