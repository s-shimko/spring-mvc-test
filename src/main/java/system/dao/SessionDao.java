package system.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionDao
{
//    private SessionDao instance;
//
//    public SessionDao getInstance() {
//        if(instance == null) {
//            instance = buildSessionFactory()
//        }
//    }

    public static SessionFactory buildSessionFactory(Class clazz){
        return new Configuration()
            .configure()
            .addAnnotatedClass(clazz)
            .buildSessionFactory();
    }

    public static SessionFactory buildSessionFactory(){
        return new Configuration()
            .configure()
            .buildSessionFactory();
    }


}
