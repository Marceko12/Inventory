package com.marcelo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.inventory.model.Sale;

@Repository
public interface  saleRepository extends JpaRepository<Sale, Long> {
    
}
