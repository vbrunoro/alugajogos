package com.example.alugajogos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {
	@GetMapping("/admin")
	public String adminHome() {
		return "adminHome";
	}
	
    @GetMapping("/admin/categories")
    public String getCategory(){
    	return "categories";
    	}
    
    @GetMapping("/admin/categories/add")
    public String getAddCategory(){
    	return "categoriesAdd";
    	}
    
}
