package system.model.vo;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;
import system.model.Product;
import system.model.User;

@Data
public class ShopSession
{
    private User user;
    private List<Product> products;
    private List<Product> purchasedProducts = new LinkedList<>();

    public ShopSession(final User user)
    {
        this.user = user;
    }

    public void buyProduct(Product product)
    {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product)
    {
        purchasedProducts.remove(product);
    }
}
