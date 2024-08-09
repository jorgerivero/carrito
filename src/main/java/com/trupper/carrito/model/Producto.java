package com.trupper.carrito.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	
}
