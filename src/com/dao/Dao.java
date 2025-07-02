  package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// ✅ Correct import


import com.model.Person;

@Repository

public class Dao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();  // ✅ Uses current session bound to transaction
    }
 
    public void inserData(Person p) {
    	 sessionFactory.getCurrentSession().save(p); 
    }

    public List<Person> viewData() {
        return getSession().createQuery("from Person", Person.class).list();
    }

    public void deletedata(int id) {
        Person p = getSession().get(Person.class, id);
        if (p != null) {
            getSession().delete(p);
        }
    }

    public void updatedata(Person p) {
        getSession().update(p);
    }

    public Person getPersonById(int id) {
        return getSession().get(Person.class, id);
    }
}