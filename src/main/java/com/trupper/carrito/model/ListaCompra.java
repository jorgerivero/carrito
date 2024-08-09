package com.trupper.carrito.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
	
	private Cliente cliente;
	
	//@OneToMany(mappedBy = "idListaCompra")
	//private ListaCompraDetalle listaCompraDetalle;
	
}
