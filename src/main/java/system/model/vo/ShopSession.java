package system.model.vo;
import java.util.List;
import system.model.Product;
import system.model.User;

public class ShopSession
{
    private User user;
    private List<Product> products;

    public ShopSession(final User user)
    {
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(final User user)
    {
        this.user = user;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(final List<Product> products)
    {
        this.products = products;
    }

    @Override
    public String toString()
    {
        return "ShopSession{" +
            "user=" + user +
            ", products=" + products +
            '}';
    }
}
