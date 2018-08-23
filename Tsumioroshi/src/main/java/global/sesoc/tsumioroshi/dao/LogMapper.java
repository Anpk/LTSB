package global.sesoc.tsumioroshi.dao;

import global.sesoc.tsumioroshi.vo.Release_Log;
import global.sesoc.tsumioroshi.vo.Stock_Log;

public interface LogMapper {
	public int insert_Release_Log_1(Release_Log r_Log);
	public int insert_Stock_Log_1(Stock_Log s_Log);
}
