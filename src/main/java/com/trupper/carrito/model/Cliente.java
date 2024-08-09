package com.trupper.carrito.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Cliente implements Serializable {

	@Id
	@Column(name = "idCliente", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	private String nombre;
	private boolean activo;

	@PrePersist
	public void prePersist() {
		this.activo = true;
	}
}
