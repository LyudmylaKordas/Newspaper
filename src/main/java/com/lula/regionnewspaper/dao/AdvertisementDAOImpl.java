package com.lula.regionnewspaper.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lula.regionnewspaper.model.Advertisement;


@Repository
public class AdvertisementDAOImpl implements AdvertisementDAO {
 	@Autowired
    private SessionFactory sessionFactory;
	
    public Advertisement getAdvertisementById(int idAdvertisement)
    {
    	 List<Advertisement> list =sessionFactory.getCurrentSession().createQuery("from Advertisement where Id_Advertisement="+idAdvertisement).list();
    	 return list.get(0);
    }
 	
    public void addAdvertisement(Advertisement advertisement) {

        sessionFactory.getCurrentSession().save(advertisement);
    }
    
    public void editAdvertisement(Advertisement advertisement) {

        sessionFactory.getCurrentSession().update(advertisement);
    }
    
    public void deleteAdvertisement(Advertisement advertisement) {

        sessionFactory.getCurrentSession().delete(advertisement);
    }
 	
    public List<Advertisement> listAdvertisement() {
    	return sessionFactory.getCurrentSession().createQuery("from Advertisment").list();
    }
    
    public List<Advertisement> listAdvertisementByCategory(int idCategory) {
    	return sessionFactory.getCurrentSession().createQuery("from Advertisement where Id_Category="+idCategory).list();
    }
}
