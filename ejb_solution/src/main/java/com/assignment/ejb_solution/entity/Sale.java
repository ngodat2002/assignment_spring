package com.assignment.ejb_solution.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;
    private long salesmanId;
    @ManyToOne
    @JoinColumn(name = "prodId",referencedColumnName = "prodId")
    private Product productId;
    private String salemanName;
    private String dos;
}