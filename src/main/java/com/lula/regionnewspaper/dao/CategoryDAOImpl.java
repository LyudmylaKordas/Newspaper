package com.lula.regionnewspaper.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lula.regionnewspaper.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;
	
    public Category getCategoryById(int idCategory)
    {
    	 List<Category> list =sessionFactory.getCurrentSession().createQuery("from Category where Id_Category="+idCategory).list();
    	 return list.get(0);
    }
    
    public List<Category> listCategory() {
    	 
        return sessionFactory.getCurrentSession().createQuery("from Category").list();
    }
	

}
