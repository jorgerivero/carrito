package com.trupper.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.carrito.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
