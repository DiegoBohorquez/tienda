package com.example.tienda.services;

import com.example.tienda.models.clienteModel;
import com.example.tienda.repositories.UIcliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clienteService {

    @Autowired
    UIcliente UIcliente;

    //create or update
    public void saveOrUpdate(clienteModel clienteModel) {
        UIcliente.save(clienteModel);
    }

    // read
    public List<clienteModel> getClientes() {
        return UIcliente.findAll();
    }

    // read by id
    public Optional<clienteModel> getCliente(Long id) {
        return UIcliente.findById(id);
    }

    // delete
    public void deleteCliente(Long id) {
        UIcliente.deleteById(id);
    }
}
