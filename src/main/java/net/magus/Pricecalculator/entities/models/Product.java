package net.magus.Pricecalculator.entities.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotEmpty
    public String name;

    @Min(0)
    public double minValue;

    @Enumerated(EnumType.STRING)
    public Coin minCoin;

    public double maxValue;

    @Enumerated(EnumType.STRING)
    public Coin maxCoin;

    @Enumerated(EnumType.STRING)
    public MaterialCategory materialCategory;

    @ManyToOne
    @JoinColumn(name = "type_id")
    public ProductType type;


}