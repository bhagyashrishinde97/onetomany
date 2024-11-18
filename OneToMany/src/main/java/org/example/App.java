package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "project" );
        Configuration cfg=new Configuration();
        cfg.configure ("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        //creating Student Object
        Student s1=new Student();

        s1.setName("Anagad");
//    creating many  subject
        Subject sub=new Subject();
        //sub.setSubjectId(101);
        sub.setSubname("java");
        sub.setStudent(s1);
        Subject sub1=new Subject();
        //sub1.setSubjectId(102);
        sub1.setSubname("Advance java");
        sub1.setStudent(s1);
        Subject sub2=new Subject();
       // sub2.setSubjectId(103);
        sub2.setSubname("java framework");
        sub2.setStudent(s1);
        Subject sub3=new Subject();
        //sub3.setSubjectId(104);
        sub3.setSubname("html");
        sub3.setStudent(s1);
        Subject sub4=new Subject();
        //sub4.setSubjectId(105);
        sub4.setSubname("css");
        sub4.setStudent(s1);
        Subject sub5=new Subject();
       // sub5.setSubjectId(106);
        sub5.setSubname("javascript");
        sub5.setStudent(s1);
        List<Subject>subList=new ArrayList<>();
        subList.add(sub);
        subList.add(sub1);
        subList.add(sub2);
        subList.add(sub3);
        subList.add(sub4);
        subList.add(sub5);
        s1.setSubject(subList);
       session.save(s1);
        tx.commit();
        factory.close();
        session.close();
}
}

