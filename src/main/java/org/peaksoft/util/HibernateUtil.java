package org.peaksoft.util;

import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.peaksoft.model.Student;
import org.peaksoft.model.Test;

public class HibernateUtil {
public static SessionFactory getSessionFactory(){
    SessionFactory sessionFactory = null;
    try {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Test.class);
        sessionFactory = configuration.buildSessionFactory();       }
    catch (HibernateError e) {
    System.out.println(e.getMessage());}
    return sessionFactory;
}

}
