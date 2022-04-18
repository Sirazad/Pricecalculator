package net.magus.Pricecalculator.entities.models;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Item {

    @NotNull
    public Products product;

    @Min(1)
    @Max(100)
    public int quality;

    @Min(0)
    public int quantity;

    public int modifier = 100;

    public int price = 0;

    @Override
    public String toString() {
        return quantity +" egység " +
                product.name +
                ", minőség:" + quality +
                ", módosító (százalék)=" + modifier;
    }
}
