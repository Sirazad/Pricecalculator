package net.magus.Pricecalculator.entities.models;

import lombok.Getter;

public enum Coin {
    COPPER(1), SILVER(100), GOLD(1000);

    @Getter
    public int value;

    private Coin (int value) {
        this.value = value;
    }
}
