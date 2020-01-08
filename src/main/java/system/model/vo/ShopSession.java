package system.model.vo;
import java.util.List;

import lombok.Data;
import system.model.Product;
import system.model.User;

@Data
public class ShopSession
{
    private User user;
    private List<Product> products;

    public ShopSession(final User user)
    {
        this.user = user;
    }
}
