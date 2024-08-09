package com.trupper.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.carrito.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
