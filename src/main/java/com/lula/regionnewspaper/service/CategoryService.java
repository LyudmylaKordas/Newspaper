package com.lula.regionnewspaper.service;

import java.util.List;

import com.lula.regionnewspaper.model.Category;

public interface CategoryService {
	public Category getCategoryById(int idCategory);
	public List<Category> listCategory();
}
