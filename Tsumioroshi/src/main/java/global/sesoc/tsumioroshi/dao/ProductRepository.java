package global.sesoc.tsumioroshi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.tsumioroshi.vo.Product;

@Repository
public class ProductRepository {
	@Autowired
	SqlSession session;
	
	public List<Product> select_Shelf_Product(String shelf_Name) {
		ProductMapper mapper = session.getMapper(ProductMapper.class);
		List<Product> list  = mapper.select_Shelf_Product(shelf_Name);
		return list;
	}
}