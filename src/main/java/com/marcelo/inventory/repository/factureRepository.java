package com.marcelo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.inventory.model.Facture;

@Repository
public interface  factureRepository extends  JpaRepository<Facture, Long> {
    
}
