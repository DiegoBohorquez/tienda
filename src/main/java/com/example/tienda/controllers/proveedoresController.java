package com.example.tienda.controllers;


import com.example.tienda.models.proveedoresModel;
import com.example.tienda.services.proveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/proveedores")
public class proveedoresController {
    @Autowired
    private proveedoresService proveedoresService;

    // create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody proveedoresModel proveedoresModel) {
        proveedoresService.saveOrUpdate(proveedoresModel);
    }

    // read
    @GetMapping
    public List<proveedoresModel> getAllProveedores() {
        return proveedoresService.getProveedores();
    }

    // read By id
    @GetMapping("/{proveedorId}")
    public Optional<proveedoresModel> getProveedorById(@PathVariable("proveedorId") Long proveedorId) {
        return proveedoresService.getProveedor(proveedorId);
    }

    // delete
    @DeleteMapping("/{proveedorId}")
    public void deleteProveedor(@PathVariable("proveedorId") Long proveedorId) {
        proveedoresService.deleteProveedor(proveedorId);
    }
}
