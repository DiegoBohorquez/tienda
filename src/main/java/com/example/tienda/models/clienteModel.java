package com.example.tienda.models;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class clienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "address")
    private String address;

}
