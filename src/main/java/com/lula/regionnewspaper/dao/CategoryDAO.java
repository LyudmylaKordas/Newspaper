package com.lula.regionnewspaper.dao;

import java.util.List;


import com.lula.regionnewspaper.model.Category;


public interface CategoryDAO {
	public Category getCategoryById(int idCategory);
	public List<Category> listCategory();
}
