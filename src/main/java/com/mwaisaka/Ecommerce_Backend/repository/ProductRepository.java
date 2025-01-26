package com.mwaisaka.Ecommerce_Backend.repository;

import com.mwaisaka.Ecommerce_Backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
