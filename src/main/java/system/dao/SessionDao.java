package system.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionDao
{
    private static SessionFactory instance;

    public static SessionFactory getInstance() {
        if(instance == null) {
            instance = buildSessionFactory();
        }
        return instance;
    }

    private static SessionFactory buildSessionFactory(){
        return new Configuration()
            .configure()
            .buildSessionFactory();
    }


}
