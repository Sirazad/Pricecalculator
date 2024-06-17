package itemservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item_type")
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public String type;

    @Column(name="default_quantity")
    public int defaultQuantity;

    @Column(name="default_unit")
    public DefaultUnit defaultUnit;

}
