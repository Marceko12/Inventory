package com.marcelo.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.inventory.model.Category;

@Repository
public interface  categoryRepository extends JpaRepository<Category, Long> {
    
}
