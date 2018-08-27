package global.sesoc.tsumioroshi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.tsumioroshi.vo.FirstCategory;
import global.sesoc.tsumioroshi.vo.SecondCategory;

@Repository
public class CategoriesRepository {

	@Autowired
	SqlSession session;

	public List<FirstCategory> selectAllFirst() {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);

		List<FirstCategory> list = mapper.selectAllFirst();

		return list;
	};

	public List<SecondCategory> selectSecond(SecondCategory second) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		List<SecondCategory> list = mapper.selectSecond(second);

		return list;
	};

	public int insertFirst(FirstCategory first) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		int result = mapper.insertFirst(first);

		return result;
	};

	public int insertSecond(SecondCategory second) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		int result = mapper.insertSecond(second);

		return result;
	};

	public FirstCategory selectByCodeFirst(FirstCategory first) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		FirstCategory result = mapper.selectByCodeFirst(first);

		return result;
	};

	public FirstCategory selectByNameFirst(FirstCategory first) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		FirstCategory result = mapper.selectByNameFirst(first);

		return result;
	};

	public List<SecondCategory> selectByFcCodeSecond(SecondCategory second) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		List<SecondCategory> list = mapper.selectByFcCodeSecond(second);

		return list;
	};

	public SecondCategory selectByNameSecond(SecondCategory second) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		SecondCategory result = mapper.selectByNameSecond(second);

		return result;
	};

	public SecondCategory selectByCodeSecond(SecondCategory second) {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		SecondCategory result = mapper.selectByCodeSecond(second);

		return result;
	};

	public FirstCategory selectLastFirst() {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		FirstCategory result = mapper.selectLastFirst();

		return result;
	}
	
	public SecondCategory selectLastSecond(SecondCategory second){
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		SecondCategory result = mapper.selectLastSecond(second);
		
		return result;
	}

	public int countFirst() {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		int result = mapper.countFirst();
		
		return result;
	}

	public int countSecond() {
		CategoriesMapper mapper = session.getMapper(CategoriesMapper.class);
		int result = mapper.countSecond();
		
		return result;
	}

}