package com.example.tienda.repositories;

import com.example.tienda.models.clienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UIcliente extends JpaRepository<clienteModel, Long> {
}
