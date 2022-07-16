package com.assignment.ejb_solution.controller;

import com.assignment.ejb_solution.entity.Product;
import com.assignment.ejb_solution.entity.Sale;
import com.assignment.ejb_solution.service.ProductService;
import com.assignment.ejb_solution.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/findAll")
public class ProductApi {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }
}
