package system.model;

import lombok.Data;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table
@Data
public class Product
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Double price;

    public Product()
    {
    }

    public Product(String name)
    {
        this.name = name;
    }
}
