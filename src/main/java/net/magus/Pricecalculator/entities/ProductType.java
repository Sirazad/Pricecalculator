package net.magus.Pricecalculator.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String type;

    public int baseQuantity;

    public String baseUnit;

}
