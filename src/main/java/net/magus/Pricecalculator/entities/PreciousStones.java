package net.magus.Pricecalculator.entities;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
public class PreciousStones {

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
}
