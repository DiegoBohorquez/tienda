package com.example.tienda.controllers;


import com.example.tienda.models.clienteModel;
import com.example.tienda.services.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/cliente")
public class clienteController {
    @Autowired
    private clienteService clienteService;

    // create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody clienteModel clienteModel) {
        clienteService.saveOrUpdate(clienteModel);
    }

    // read
    @GetMapping
    public List<clienteModel> getAllClientes() {
        return clienteService.getClientes();
    }

    // read by id
    @GetMapping("/{clienteId}")
    public Optional<clienteModel> getCliente(@PathVariable("clienteId") Long clienteId) {
        return clienteService.getCliente(clienteId);
    }

    // delete
    @DeleteMapping("/{clienteId}")
    public void deleteCliente(@PathVariable("clienteId") Long clienteId) {
        clienteService.deleteCliente(clienteId);
    }
}
