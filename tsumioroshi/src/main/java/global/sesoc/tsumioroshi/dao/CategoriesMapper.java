package global.sesoc.tsumioroshi.dao;

import java.util.List;

import global.sesoc.tsumioroshi.vo.FirstCategory;
import global.sesoc.tsumioroshi.vo.SecondCategory;

public interface CategoriesMapper {
	public List<FirstCategory> selectAllFirst();
	public List<SecondCategory> selectSecond(SecondCategory second);
	public int insertFirst(FirstCategory first);
	public int insertSecond(SecondCategory second);
	public FirstCategory selectByCodeFirst(FirstCategory first);
	public FirstCategory selectByNameFirst(FirstCategory first);
	public List<SecondCategory> selectByFcCodeSecond(SecondCategory second);
	public SecondCategory selectByNameSecond(SecondCategory second);
	public SecondCategory selectByCodeSecond(SecondCategory second);
	public FirstCategory selectLastFirst();
	public SecondCategory selectLastSecond(SecondCategory second);
	public int countFirst();
	public int countSecond();
}
