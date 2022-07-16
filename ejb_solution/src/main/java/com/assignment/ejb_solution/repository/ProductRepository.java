package com.assignment.ejb_solution.repository;

import com.assignment.ejb_solution.entity.Product;
import com.assignment.ejb_solution.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
