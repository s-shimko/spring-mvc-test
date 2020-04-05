package system.service;

import org.springframework.stereotype.Service;
import system.model.User;
import system.model.vo.ShopSession;

@Service
public class ShopSessionService
{
    private static ShopSession shopSession;

    public static ShopSession getShopSession()
    {
        return shopSession;
    }

    public static ShopSession createShopSession(User user)
    {
        if (shopSession != null)
        {
            if (!shopSession.getUser().getName().equals(user.getName()))
            {
                shopSession = null;
                shopSession = new ShopSession(user);
            }
        }
        else{ shopSession = new ShopSession(user); }
        return shopSession;
    }
}
