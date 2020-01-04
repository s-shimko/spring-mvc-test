package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Iterable<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUser(User user) {
        return userDao.getUser(user);
    }

    public User getLastUser() {
        return userDao.getLastUser();
    }

    public void createUser(User user) {
        userDao.createUser(user);
    }


}
