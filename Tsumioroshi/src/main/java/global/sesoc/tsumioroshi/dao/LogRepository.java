package global.sesoc.tsumioroshi.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.tsumioroshi.vo.Release_Log;
import global.sesoc.tsumioroshi.vo.Stock_Log;


@Repository
public class LogRepository {
	@Autowired
	SqlSession session;
	
	public int insert_Release_Log_1(Release_Log r_Log) {
		LogMapper mapper = session.getMapper(LogMapper.class);
		int result = mapper.insert_Release_Log_1(r_Log);
		
		return result;
	}
	
	public int insert_Stock_Log_1(Stock_Log s_Log) {
		LogMapper mapper = session.getMapper(LogMapper.class);
		int result = mapper.insert_Stock_Log_1(s_Log);
		
		return result;
	}
}
