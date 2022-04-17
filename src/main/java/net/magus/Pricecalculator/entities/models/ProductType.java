package net.magus.Pricecalculator.entities.models;

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

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", baseQuantity=" + baseQuantity +
                ", baseUnit='" + baseUnit + '\'' +
                '}'+"\n";
    }
}
