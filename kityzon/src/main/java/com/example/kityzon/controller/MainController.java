package com.example.kityzon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.kityzon.model.User;

/**
 * This class does save user, update user, delete user, find all users in the
 * website.
 */
@Controller
public class MainController {
	@Autowired
	private UserService userService;


	@RequestMapping("/home")
	public String home(Model page) {
		page.addAttribute("username", "Kity");
		page.addAttribute("color", "blue");
		return "home.html";
	}

	

	@RequestMapping("/product_fitbit")
	public String products(Model model) {
		//var products =  productsService.findAll();
		//model.addAttribute("products", products);
		return "product_fitbit.html";
	}


	@GetMapping("/order")
	public String findShowtimeById(@RequestParam int showtimeId, Model model) {
	
		return "order.html";
	}

	@GetMapping("/cart")
	public String cart(@RequestParam int userId, Model model) {
		
		return "cart.html";
	}	
}
