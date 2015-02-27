/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.home.jpaone.dao.impl;

import com.home.jpaone.dao.ContactDAO;
import com.home.jpaone.entity.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author CodingFr3ak
 */
public class ContactDAOImpl implements ContactDAO{
    private EntityManagerFactory factory;
    private EntityManager manager;
    public ContactDAOImpl(String pUnit){
        factory=Persistence.createEntityManagerFactory(pUnit);
        manager=factory.createEntityManager();
        
    }
    private EntityTransaction getTransaction(){
        return manager.getTransaction();
    }
    
    @Override
    public int insert(Contact c){
      int id=0;
      getTransaction().begin();
      manager.persist(c);
      manager.flush();
      id=c.getId();
      getTransaction().commit();
      return id;
    
    }
    @Override
    public int update(Contact c){
        getTransaction().begin();
        manager.merge(c);
        getTransaction().commit();
        return 1;
    }
    @Override
    public int delete(int id){
        Contact c=findById(id);
        if(c!=null){
        getTransaction().begin();
        manager.remove(c);
        getTransaction().commit();
       }
       return 1; 
    }
    @Override
    public Contact findById(int id){
        return (Contact)manager.find(Contact.class,id);
    }
    @Override
    public List<Contact> getAll(){
        return (List<Contact>)manager.createQuery("SELECT c FROM Contact c").getResultList();
    }
}

