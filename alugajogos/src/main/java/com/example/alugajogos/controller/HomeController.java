package com.example.alugajogos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.alugajogos.global.GlobalData;
import com.example.alugajogos.service.CategoryService;
import com.example.alugajogos.service.ProductService;


/**
 * Controla a página de visualização dos produtos pelo usuário.
 * 
 * Controla a operação de leitura dos produtos por categoria.
 */
 

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping({"/","/home","/shop"})
    public String shop(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products",productService.getAllProduct());
        model.addAttribute("cartCount",GlobalData.cart.size());

        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String getProductByCategory(@PathVariable int id, Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products",productService.getAllProductsByCategoryId(id));
        model.addAttribute("cartCount",GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String getProductById(@PathVariable Long id, Model model){
        model.addAttribute("product",productService.getProductById(id).get());
        model.addAttribute("cartCount",GlobalData.cart.size());
        return "viewProduct";
    }
}