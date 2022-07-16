package com.assignment.ejb_solution.repository;

import com.assignment.ejb_solution.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Integer> {

}
