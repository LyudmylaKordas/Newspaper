package com.lula.regionnewspaper.service;

import java.util.List;

import com.lula.regionnewspaper.model.Advertisement;

public interface AdvertisementService {
	public Advertisement getAdvertisementById(int idAdvertisement);
	public void addAdvertisement(Advertisement advertisement);
	public void editAdvertisement(Advertisement advertisement);
    public void deleteAdvertisement(Advertisement advertisement);
	public List<Advertisement> listAdvertisement();
	public List<Advertisement> listAdvertisementByCategory(int idCategory);
}
