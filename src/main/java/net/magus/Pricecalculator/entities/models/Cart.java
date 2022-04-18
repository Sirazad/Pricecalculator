package net.magus.Pricecalculator.entities.models;


import lombok.Getter;

import java.util.List;

@Getter
public class Cart {

    public Long id;
    public List<Item> items;
    public double price;

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("Eddig vett termékek: \n");
        for (Item item : items) {
            text.append(item);
            text.append("\n");
        }
        text.append("Össz költség: "+price);
        return text.toString();
    }
}
