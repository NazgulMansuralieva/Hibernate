package org.peaksoft;

import org.hibernate.Session;
import org.peaksoft.model.Student;
import org.peaksoft.model.Test;
import org.peaksoft.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aizirek", "Toktosunova", "aizirek@gmail.com", 18);
        Student student2 = new Student("Adina", "Atakulova", "adina@gmail.com", 20);
        Student student3 = new Student("Munara", "Aralbek kyzy", "munara@gmail.com", 22);
      creatStudent(new Test("Nazgul"));
//      creatStudent(student2);
//      creatStudent(student3);
    }

    public static void creatStudent(Test student) {
        System.out.println("Start");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("Transaction is begin");
//        session.persist(student);
        session.getTransaction().commit();
        System.out.println("Transaction is commit");
        session.close();

    }
}
