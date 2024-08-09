package com.trupper.carrito.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Cliente implements Serializable {

	@Id
	@Column(name = "clienteID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteID;
	
	private String nombre;
	private boolean activo;
}
