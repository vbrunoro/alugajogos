package com.example.alugajogos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.alugajogos.global.GlobalData;
import com.example.alugajogos.model.Order;
import com.example.alugajogos.model.Product;
import com.example.alugajogos.model.User;
import com.example.alugajogos.repository.OrderRepository;
import com.example.alugajogos.repository.UserRepository;
import com.example.alugajogos.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderService orderService;
    @Autowired
    UserRepository userRepository;
   
   
    @PostMapping("/pagamento")

    public String orderPayment(@ModelAttribute("order") Order order, Model model){
    	    
    	     	
        order.setSubtotal(GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        Optional<User> user = userRepository.findUserByEmail(order.getEmail());
        
        model.addAttribute("name", order.getFirstName());
        model.addAttribute("email", order.getEmail());
        model.addAttribute("address", order.getAddress());

        if(user.isPresent()){
            order.setCustomerId(user.get().getId());
            orderService.createOrder(order);


            GlobalData.cart.clear();
        }else{
            GlobalData.cart.clear();
        }
    
        return "orderPlaced";
    }
    


}