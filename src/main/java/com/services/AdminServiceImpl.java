package com.services;

import com.model.Admin;
import com.model.Attendence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    SessionFactory sessionFactory;
    public List<Admin> getAdmin() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Admin> adminList = session.createQuery("from Admin",Admin.class).list();
        transaction.commit();
        session.close();
        return adminList;
    }

    public Admin create(Admin admin) {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(admin);
        transaction1.commit();
        session2.close();
        return admin;
    }

    public Admin getAdminById(int id) {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Admin admin = session1.get(Admin.class, id);
        transaction1.commit();
        session1.close();
        return admin;
    }

    public Admin updateAdmin(Admin admin) {
        Session session2 = sessionFactory.openSession();
        Transaction transaction2 = session2.beginTransaction();
        session2.saveOrUpdate(admin);
        transaction2.commit();
        session2.close();
        return admin;
    }

    public Admin deleteAdmin(int id) {
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        Admin admin = session3.get(Admin.class, id);
        session3.delete(admin);
        transaction3.commit();
        session3.close();
        return admin;
    }
}

