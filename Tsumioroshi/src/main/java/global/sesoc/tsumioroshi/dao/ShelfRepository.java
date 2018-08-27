package global.sesoc.tsumioroshi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.tsumioroshi.vo.Shelf;


@Repository
public class ShelfRepository {
	@Autowired
	SqlSession session;
	
	public Shelf select_Shelf(String shelf_Name) {
		ShelfMapper mapper = session.getMapper(ShelfMapper.class);
		
		Shelf shelf  = mapper.select_Shelf(shelf_Name);
		
		return shelf;
	}
	
	public List<Shelf> select_Every_Shelves() {		
		ShelfMapper mapper = session.getMapper(ShelfMapper.class);
		
		List<Shelf> list = mapper.select_Every_Shelves();
		
		return list;
	}
}
