package com.lula.regionnewspaper.controller;


import java.util.Date;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lula.regionnewspaper.model.Advertisement;
import com.lula.regionnewspaper.model.Category;
import com.lula.regionnewspaper.service.AdvertisementService;
import com.lula.regionnewspaper.service.CategoryService;

@Controller
public class AdvertisementController {
		@Autowired
	    private AdvertisementService advertisementService;
		
	    @Autowired
	    private CategoryService categoryService;
	    private Advertisement advertisementObj;
	    private Category categoryObj;

	    private List<Advertisement> listAdvertisements;
	    private List<Category> listCategory;
	    
	    
		@RequestMapping(value = "/addAdvertisement.html")
		public String addAdvertisementView(Map<String, Object> map)
		{	
			map.put("advertisement", new Advertisement());
			map.put("categoryList", categoryService.listCategory());
		    return "addAdvertisement";
		}
		
		@RequestMapping(value = "/addAdvertisement.html", method = RequestMethod.POST)
		public String addAdvertisement(@ModelAttribute("advertisement") Advertisement advertisement, BindingResult result) 
		{
				Date date=new Date();
		        advertisement.setDate(date);
		        Category category=categoryService.getCategoryById(Integer.parseInt(result.getFieldValue("category").toString()));
		        advertisement.setCategory(category);
		        advertisementService.addAdvertisement(advertisement);
		        return "redirect:/category.html";
		}
		
		
		@RequestMapping(value = "/editAdvertisement/{idAdvertisement}.html")
		public String editAdvertisementView(@PathVariable("idAdvertisement") Integer idAdvertisement, Map<String, Object> map)
		{
				advertisementObj=advertisementService.getAdvertisementById(idAdvertisement);
				listCategory=categoryService.listCategory();
		        return "redirect:/editAdvertisement.html";
		}
		
		@RequestMapping(value = "/editAdvertisement.html")
		public String editAdvertisementView(Map<String, Object> map)
		{
				map.put("advertisement",advertisementObj);
				map.put("categoryList", listCategory);
		        return "editAdvertisement";
		}
		
		@RequestMapping(value = "/editAdvertisement.html", method = RequestMethod.POST)
		public String editAdvertisement(@ModelAttribute("advertisement") Advertisement advertisement, BindingResult result) 
		{
				advertisement.setIdAdvertisement(advertisementObj.getIdAdvertisement());
				Date date=new Date();
		        advertisement.setDate(date);
		        Category category=categoryService.getCategoryById(Integer.parseInt(result.getFieldValue("category").toString()));
		        advertisement.setCategory(category);
		        advertisementService.editAdvertisement(advertisement);
		        return "redirect:/detailsAdvertisementById/"+advertisement.getIdAdvertisement()+".html";
		}
		
		
		@RequestMapping(value = "/deleteAdvertisement/{idAdvertisement}.html")
		public String deleteAdvertisement(@PathVariable("idAdvertisement") Integer idAdvertisement, Map<String, Object> map)
		{		
			advertisementObj=advertisementService.getAdvertisementById(idAdvertisement);
			advertisementService.deleteAdvertisement(advertisementObj);
		    return "redirect:/advertisementByCategory/"+advertisementObj.getCategory().getIdCategory()+".html";
		}		
		
		
		@RequestMapping(value = "/detailsAdvertisementById/{idAdvertisement}.html")
		public String detailsAdvertisementView(@PathVariable("idAdvertisement") Integer idAdvertisement, Map<String, Object> map)
		{		
			advertisementObj=advertisementService.getAdvertisementById(idAdvertisement);
			categoryObj=categoryService.getCategoryById(advertisementObj.getCategory().getIdCategory());
		    return "redirect:/detailsAdvertisement.html";
		}
		
		
	    @RequestMapping("/detailsAdvertisement.html")
	    public String advertisement(Map<String, Object> map) {
	    	map.put("advertisement", advertisementObj);
			map.put("category", categoryObj);
	        return "detailsAdvertisement";
	    }    
	    
	    
	    @RequestMapping("/advertisementByCategory/{idCategory}.html")
	    public String getListAdvertisementsById(@PathVariable("idCategory") Integer idCategory, Map<String, Object> map) 
	    {
	    	listAdvertisements=advertisementService.listAdvertisementByCategory(idCategory);
	    	categoryObj=categoryService.getCategoryById(listAdvertisements.get(0).getCategory().getIdCategory());
	    	return "redirect:/advertisement.html";
	    }
	    
	    @RequestMapping("/advertisement.html")
	    public String getListAdvertisements(Map<String, Object> map)
	    {
	        map.put("category", categoryObj);
	        map.put("advertisementList", listAdvertisements);
	        return "advertisement";
	    }
	    
}
