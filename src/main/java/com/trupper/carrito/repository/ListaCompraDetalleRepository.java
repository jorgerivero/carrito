package com.trupper.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.carrito.model.ListaCompraDetalle;
import com.trupper.carrito.model.ListaCompraDetallePK;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaCompraDetalleRepository extends JpaRepository<ListaCompraDetalle, ListaCompraDetallePK> {

	
	
}
