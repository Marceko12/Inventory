package com.marcelo.inventory.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // ATRIBUTOS
    private Long id_facture;
    // codigo 
    private String codigo;
    // fecha
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name="id_sale")
    private Sale venta;
    
    // Atributos natos de la tabla
    private double subtotal;
    private double impuesto;
    private double total;
    // metodos de pago 
    private String metodo_pago;
    
    


}
