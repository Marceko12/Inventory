package com.marcelo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.inventory.model.DetailSale;

@Repository
public interface  detailsRepository extends JpaRepository<DetailSale, Long> {
    
}
