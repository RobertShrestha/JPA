/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.home.jpaone;

import com.home.jpaone.dao.ContactDAO;
import com.home.jpaone.dao.impl.ContactDAOImpl;
import com.home.jpaone.entity.Contact;

/**
 *
 * @author CodingFr3ak
 */
public class JPAone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactDAO contactDAO=new ContactDAOImpl("JPA1PU");
//        contactDAO.insert(new Contact(110,"Robert","Shrestha","hello@gmail.com",8993987));
//        int num=contactDAO.update(new Contact(53,"hello","hello","hello@gmail.com",8998987));
//        Contact c=contactDAO.findById(102);
//        if(c!=null){
//            System.out.println(c.toString());
//       }
//        else{
//           System.out.println("Record not found");
//       }
//         contactDAO.delete(102);
      for(Contact c: contactDAO.getAll()){
            System.out.println(c.toString());
        }
//        
        
        
        
        
        
    }
    
}
