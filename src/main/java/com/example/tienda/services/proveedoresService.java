package com.example.tienda.services;


import com.example.tienda.models.proveedoresModel;
import com.example.tienda.repositories.UIproveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class proveedoresService {
    @Autowired
    UIproveedores UIproveedores;

    // create or update
    public void saveOrUpdate(proveedoresModel proveedoresModel) {
        UIproveedores.save(proveedoresModel);
    }

    // read
    public List<proveedoresModel> getProveedores() {
        return UIproveedores.findAll();
    }


    //read by id
    public Optional<proveedoresModel> getProveedor(Long id) {
        return UIproveedores.findById(id);
    }

    // delete by id

    public void deleteProveedor(Long id) {
        UIproveedores.deleteById(id);
    }


}
