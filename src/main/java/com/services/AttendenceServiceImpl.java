package com.services;

import com.model.Attendence;
import com.model.Student;
import com.model.Teacher;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttendenceServiceImpl implements AttendenceService{

    @Autowired
    SessionFactory sessionFactory;

    public List<Attendence> getAttendence() throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Attendence> attendenceList = session.createQuery("from Attendence",Attendence.class).list();
        transaction.commit();
        session.close();
        return attendenceList;
    }

    public Attendence create(Attendence attendence) {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(attendence);
        transaction1.commit();
        session2.close();
        return attendence;
    }

    public Attendence getAttendenceByDate(String date)
    {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Attendence attendence = session1.get(Attendence.class, date);
        transaction1.commit();
        session1.close();
        return attendence;
    }
    public Attendence updateAttendence (Attendence attendence){
        Session session2 = sessionFactory.openSession();
        Transaction transaction2 = session2.beginTransaction();
        session2.saveOrUpdate(attendence);
        transaction2.commit();
        session2.close();
        return attendence;
    }
    public Attendence deleteAttendence (String date){
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        Attendence attendence = session3.get(Attendence.class, date);
        session3.delete(attendence);
        transaction3.commit();
        session3.close();
        return attendence;
    }

    /*public List<Attendence> getAttendenceByStudent(int id) {
        return null;
    }

    public List<Attendence> getAttendenceByTeacher(int id) {
        return null;
    }
    public Attendence getAttendencebyStudent(int id)
    {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Attendence attendence= session1.get(Student.class, id);
        transaction1.commit();
        session1.close();
        return attendence;
    }*/

}
