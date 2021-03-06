package system.service;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public SessionFactory getDb(Class clazz){
        return userDao.getDb(clazz);
    }

    public User getUser(User user)
    {
        return userDao.getUser(user);
    }

}
