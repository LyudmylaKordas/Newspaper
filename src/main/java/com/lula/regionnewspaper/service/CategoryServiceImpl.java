package com.lula.regionnewspaper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lula.regionnewspaper.dao.CategoryDAO;
import com.lula.regionnewspaper.model.Category;

@Service
public class CategoryServiceImpl  implements CategoryService {
	 	@Autowired
	    private CategoryDAO categoryDAO;
	 	
	    @Transactional
		public Category getCategoryById(int idCategory)
	    {
	    	return categoryDAO.getCategoryById(idCategory);
	    }
	 	
	    @Transactional
	    public List<Category> listCategory() {
	 
	        return categoryDAO.listCategory();
	    }

}
