package global.sesoc.tsumioroshi.dao;

import java.util.List;

import global.sesoc.tsumioroshi.vo.Product;

public interface ProductMapper {
	public List<Product> select_Shelf_Product(String shelf_Name);
}