package system.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.Product;
import system.model.User;
import system.model.vo.ShopSession;

@Service
public class AuthorizeService
{
    @Autowired
    private UserDao userDao;

    public ShopSession authorizeUser(User user) {
        List<Product> products = userDao.getUserProducts(user);
        ShopSession shopSession = new ShopSession(user);
        shopSession.setUser(user);
        shopSession.setProducts(products);
        return shopSession;
    }
}
