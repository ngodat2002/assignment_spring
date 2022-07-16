package com.assignment.ejb_solution.service;

import com.assignment.ejb_solution.entity.Product;
import com.assignment.ejb_solution.entity.Sale;
import com.assignment.ejb_solution.repository.ProductRepository;
import com.assignment.ejb_solution.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }
}
