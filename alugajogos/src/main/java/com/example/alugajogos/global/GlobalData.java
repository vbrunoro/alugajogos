package com.example.alugajogos.global;

import java.util.ArrayList;
import java.util.List;

import com.example.alugajogos.model.Product;

public class GlobalData {
    
	public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}