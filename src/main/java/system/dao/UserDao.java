package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import system.repos.UserRepository;
import system.model.Product;
import system.model.User;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao
{
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(User user)
    {
        return userRepository.findUserByNameAndPassword(user.getName(), user.getPassword()).get(0);
    }

    public User getLastUser()
    {
        return userRepository.findFirstByOrderByIdDesc();
    }

    public void createUser(User user)
    {
        userRepository.save(user);
    }

    public List<Product> getUserProducts(User user)
    {
        return null;
    }


}
