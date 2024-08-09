package com.trupper.carrito.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Cliente {
	
	@Id
	private Long idCliente;
	
	private String nombre;
	private boolean activo;
}
