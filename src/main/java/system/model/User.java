package system.model;

import java.util.List;
import lombok.Data;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String role;

    public User(){}

    public User(final String name, final String password)
    {
        this.name = name;
        this.password = password;
    }

    public User(final String name, final String password, final String role)
    {
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
