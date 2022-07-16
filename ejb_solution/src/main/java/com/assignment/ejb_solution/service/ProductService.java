package com.assignment.ejb_solution.service;

import com.assignment.ejb_solution.entity.Product;
import com.assignment.ejb_solution.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
