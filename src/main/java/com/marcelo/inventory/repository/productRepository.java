package com.marcelo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.inventory.model.Product;
@Repository
public interface productRepository extends JpaRepository<Product, Long> {
    
}
