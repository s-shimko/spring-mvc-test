package system.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import system.model.Product;
import system.model.User;

@Repository
public class UserDao extends SessionDao
{
    private SessionFactory session;

    public SessionFactory getDb(Class clazz){
        session = buildSessionFactory(clazz);
        return session;
    }

    private SessionFactory getSession() {
        return session;
    }

    public List<User> getAllUsers(){
        Query query = getSession().createEntityManager().createQuery("from User");
        return query.getResultList();
    }

    public User getUser(User user)
    {
        String hql =
            "FROM User WHERE name='" + user.getName() + "' and password='" + user.getPassword() +
                "'";
        SessionFactory db = getDb(User.class);
        Session session = db.openSession();
        session.beginTransaction();
        org.hibernate.query.Query query = session.createQuery(hql);
        List users = query.list();
        return users.size() > 0 ? (User) users.get(0) : null;
    }

    public List<Product> getUserProducts(User user){
        return null;
    }


}
