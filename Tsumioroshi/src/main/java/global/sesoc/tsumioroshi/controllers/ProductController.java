package global.sesoc.tsumioroshi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import global.sesoc.tsumioroshi.dao.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
}