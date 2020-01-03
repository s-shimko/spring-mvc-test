package example.beans;

public class User
{
    private Integer id;
    private String name;
    private String password;
    private String role;

    public User(final Integer id, final String name, final String password, final String role)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(final Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(final String password)
    {
        this.password = password;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(final String role)
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", role='" + role + '\'' +
            '}';
    }
}
