package global.sesoc.tsumioroshi.dao;

import java.util.List;

import global.sesoc.tsumioroshi.vo.Shelf;

public interface ShelfMapper {
	public Shelf select_Shelf(String shelf_Name);
	public List<Shelf> select_Every_Shelves();
}