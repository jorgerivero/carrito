package com.trupper.carrito.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "lista_compra")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ListaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLista;
	
	private String customerId;
	private String nombre;
	
	@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
	private LocalDateTime fechaRegistro;
	
	@DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
	private LocalDateTime fechaUltimaActualizacion;
	
	private boolean activo;
	
	//private Cliente cliente;
	
	//@OneToMany(mappedBy = "idListaCompra")
	//private ListaCompraDetalle listaCompraDetalle;

	@PrePersist
	public void prePersist() {
		this.fechaRegistro = LocalDateTime.now();
		this.fechaUltimaActualizacion = LocalDateTime.now();
		this.activo = true;
	}

	@PreUpdate
	public void preUpdate() {
		this.fechaUltimaActualizacion = LocalDateTime.now();
	}
	
}
