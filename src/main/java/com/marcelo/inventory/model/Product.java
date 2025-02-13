package com.marcelo.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id_product;
    private String nombre;
    private String serie;
    private Double precio;
    private int stock;
    private String marca;
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Category categoria;

}
