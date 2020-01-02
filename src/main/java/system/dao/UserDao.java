package system.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import system.model.Product;
import system.model.User;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDao extends SessionDao
{

    public List<User> getAllUsers(){
        Query query = SessionDao.getInstance().createEntityManager().createQuery("from User");
        return query.getResultList();
    }

    public User getUser(User user)
    {
        String hql =
            "FROM User WHERE name='" + user.getName() + "' and password='" + user.getPassword() +
                "'";
        Session session = SessionDao.getInstance().openSession();
        session.beginTransaction();
        org.hibernate.query.Query query = session.createQuery(hql);
        List users = query.list();
        return users.size() > 0 ? (User) users.get(0) : null;
    }

    public User getLastUser(){
        Session session = SessionDao.getInstance().openSession();
        User lastUser = (User) session.createQuery("from User ORDER BY id DESC")
                .setMaxResults(1)
                .uniqueResult();
        session.close();
        return lastUser;
    }

    public void createUser(User user){
        Session session = SessionDao.getInstance().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    public List<Product> getUserProducts(User user){
        return null;
    }


}
