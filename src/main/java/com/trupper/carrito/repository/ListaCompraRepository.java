package com.trupper.carrito.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trupper.carrito.model.ListaCompra;

public interface ListaCompraRepository extends JpaRepository<ListaCompra, Long> {

    @Query(value = "select * from ListaCompra where id_cliente = :idCliente", nativeQuery = true)
    List<ListaCompra> getListaCompras(@Param("idCliente") Long idCliente);
    
}
