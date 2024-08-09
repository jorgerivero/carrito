package com.trupper.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.carrito.model.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
