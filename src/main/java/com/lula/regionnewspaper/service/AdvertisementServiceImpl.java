package com.lula.regionnewspaper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lula.regionnewspaper.dao.AdvertisementDAO;
import com.lula.regionnewspaper.model.Advertisement;


@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	@Autowired
    private AdvertisementDAO advertisementDAO;
	
    @Transactional
	public Advertisement getAdvertisementById(int idAdvertisement)
    {
    	return advertisementDAO.getAdvertisementById(idAdvertisement);
    }
	
	@Transactional
    public void addAdvertisement(Advertisement advertisement) {
        advertisementDAO.addAdvertisement(advertisement);
    }
	
	@Transactional
    public void editAdvertisement(Advertisement advertisement) {
        advertisementDAO.editAdvertisement(advertisement);
    }
	
	@Transactional
    public void deleteAdvertisement(Advertisement advertisement) {
        advertisementDAO.deleteAdvertisement(advertisement);
    }
 
 
    @Transactional
    public List<Advertisement> listAdvertisement() {
 
        return advertisementDAO.listAdvertisement();
    }
    
    
    @Transactional
    public List<Advertisement> listAdvertisementByCategory(int idCategory) {
 
        return advertisementDAO.listAdvertisementByCategory(idCategory);
    }
}
