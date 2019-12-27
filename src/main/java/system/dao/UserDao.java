package system.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
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
}
