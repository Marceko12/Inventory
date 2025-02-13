package com.marcelo.inventory.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id_sale;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Client id_client;
    // columna total
    private double total;
    
    @OneToOne(mappedBy= "venta", cascade=CascadeType.ALL)
    private Facture factura;
    
}
