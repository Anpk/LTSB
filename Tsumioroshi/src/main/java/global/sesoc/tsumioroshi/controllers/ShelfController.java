package global.sesoc.tsumioroshi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.tsumioroshi.dao.ProductRepository;
import global.sesoc.tsumioroshi.dao.ShelfRepository;
import global.sesoc.tsumioroshi.vo.Product;
import global.sesoc.tsumioroshi.vo.Shelf;

@Controller
public class ShelfController {
	
	@Autowired
	ShelfRepository s_Repository;
	
	@Autowired
	ProductRepository p_Repository;

	
	// 선반 하나 조회 + 해당 선반에 있는 상품들 조회
	@RequestMapping(value = "/select_Shelf", method = RequestMethod.GET)
	public String select_Shelf(String shelf_Name, Model model) {
		
		Shelf shelf = s_Repository.select_Shelf(shelf_Name);		
		model.addAttribute("shelf", shelf);
		
		List<Product> list = p_Repository.select_Shelf_Product(shelf_Name);
		model.addAttribute("list", list);
		
		return "shelf/select_Shelf";
	}
	
	// 모든 선반 조회
	@RequestMapping(value="/select_Every_Shelves", method=RequestMethod.GET)
	public String select_Every_Shelves(Model model) {
		
		List<Shelf> list = s_Repository.select_Every_Shelves();
		
		model.addAttribute("list", list);
		
		return "shelf/select_Every_Shelves";
	}
}
