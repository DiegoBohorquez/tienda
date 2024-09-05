package com.example.tienda.repositories;

import com.example.tienda.models.proveedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UIproveedores extends JpaRepository<proveedoresModel, Long> {
}
