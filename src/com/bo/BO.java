package com.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Dao;
import com.model.Person;

@Service
public class BO {

    @Autowired
    private Dao dao;

    @Transactional
    public void inserData(Person p) {
        dao.inserData(p);
    }

    @Transactional(readOnly = true)
    public List<Person> viewdata() {
        return dao.viewData();
    }

    @Transactional
    public void deletedata(int id) {
        dao.deletedata(id);
    }

    @Transactional(readOnly = true)
    public Person getPersonById(int id) {
        return dao.getPersonById(id);
    }

    @Transactional
    public void updatedata(Person p) {
        dao.updatedata(p);
    }
}
