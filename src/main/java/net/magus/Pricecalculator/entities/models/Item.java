package net.magus.Pricecalculator.entities.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
public class Item {
    private static int counter = 0;

    @Id
    private  int id;

    @ManyToOne
    private Product product;

    @Min(1)
    @Max(100)
    private  int quality;

    @Min(0)
    private int quantity;

    private int modifier = 100;

    private int price = 0;

    public Item() {
        id = ++counter;
        if (counter >= 10_000) counter = 0;
    }

    @Override
    public String toString() {
        return quantity +" egység " + product.name + " termék" +
                ", minőség:" + quality +
                ", módosító (százalék)=" + modifier;
    }
}
