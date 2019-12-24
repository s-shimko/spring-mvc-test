package system.dao;

import java.util.Arrays;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import system.model.User;

@Repository
public class UserDao extends SessionDao
{
    private List<User> users =
        Arrays.asList(new User("admin", "admin"), new User("user1", "user1"));

    public List<User> getAllUsers(){
        return users;
    }

    public SessionFactory getDb(Class clazz){
        return buildSessionFactory(clazz);
    }
}
