package com.lula.regionnewspaper.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lula.regionnewspaper.model.Advertisement;
import com.lula.regionnewspaper.model.Category;
import com.lula.regionnewspaper.service.CategoryService;


@Controller
public class CategoryController 
{
	
    @Autowired
    private CategoryService categoryService;

    
    @RequestMapping("/category.html")
    public String listCategories(Map<String, Object> map) 
    {
        map.put("category", new Category());
        map.put("categoryList", categoryService.listCategory());
        return "category";
    }

}
