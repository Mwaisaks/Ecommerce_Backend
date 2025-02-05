package com.mwaisaka.Ecommerce_Backend.service;

import com.mwaisaka.Ecommerce_Backend.model.Product;
import com.mwaisaka.Ecommerce_Backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {

        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
}
