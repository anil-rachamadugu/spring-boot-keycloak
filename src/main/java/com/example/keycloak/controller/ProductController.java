package com.example.keycloak.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.keycloak.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(path = "/products")
	public String getProducts(HttpServletRequest request) {
		return "<h1>Products Page</h1><p> <a href=\"/logout\">Logout</a> </p>";
	}

	@GetMapping(path = "/customers")
	public String getCustomers(HttpServletRequest request) {
		return "<h1>Customers Page</h1><p> <a href=\"/logout\">Logout</a> </p>";
	}

	@GetMapping(path = "/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.logout();
		response.sendRedirect("/");
	}
}
