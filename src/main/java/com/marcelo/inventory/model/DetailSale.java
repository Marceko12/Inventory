package com.marcelo.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetailSale {
    //identificador detalle venta
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_details;
    //Foreing key
    @ManyToOne
    @JoinColumn(name="id_sale")
    private Sale venta;

    //Foreing key
    @ManyToOne
    @JoinColumn(name="id_producto")
    private Product producto;

    private int cantidad;
    private double precio_unitario;
    private double total;

}

