package net.magus.Pricecalculator.entities.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@MappedSuperclass
public abstract class Products {

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
