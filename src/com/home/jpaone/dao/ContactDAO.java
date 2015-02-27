/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.home.jpaone.dao;

import com.home.jpaone.entity.Contact;
import java.util.List;

/**
 *
 * @author CodingFr3ak
 */
public interface ContactDAO {
    public int insert(Contact c);
    public int update(Contact c);
    public int delete(int id);
    public Contact findById(int id);
    public List<Contact> getAll();
 }
