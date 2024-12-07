package com.JFS.Hibernate_Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction tnx=s.beginTransaction();
       
       Employee e=new Employee();
       e.setFname("KA");
       e.setLname("VYA");
       s.save(e);
       tnx.commit();
       
       Transaction tnx1=s.beginTransaction();       
       Permanent_employee pe=new Permanent_employee();
       pe.setFname("abc");
       pe.setLname("def");
       pe.setDept("cse");
       pe.setSal(90000);
       s.save(pe);
       tnx1.commit();
       
       Transaction tnx2=s.beginTransaction();       
       Contract_employee ce=new Contract_employee();
       ce.setFname("abc");
       ce.setLname("def");
       ce.setDept("cse");
       ce.setSal(90000);
       ce.setC_yr(2024);
       ce.setS_sal(90000);
       s.save(ce);
       tnx2.commit();
       System.out.println("Success");
       
       
      
    }
}