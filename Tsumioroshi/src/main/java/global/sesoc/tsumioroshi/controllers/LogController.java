package global.sesoc.tsumioroshi.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.tsumioroshi.dao.LogRepository;
import global.sesoc.tsumioroshi.vo.Release_Log;
import global.sesoc.tsumioroshi.vo.Stock_Log;

@Controller
public class LogController {
	
	@Autowired
	LogRepository repository;
	
	// 출고 기록 작성 폼 화면 호출
	@RequestMapping(value = "/release_Log_Form_1", method = RequestMethod.GET)
	public String release_Log(Locale locale, Model model) {		
		return "log/release_Log_Form_1";
	}
	
	// 입고 기록 작성 폼 화면 호출
	@RequestMapping(value = "/stock_Log_Form_1", method = RequestMethod.GET)
	public String stock_Log(Locale locale, Model model) {		
		return "log/stock_Log_Form_1";
	}

	// 출고 기록 작성 후 데이터 초안 전송
	@RequestMapping(value="/release_Log_Form_1", method=RequestMethod.POST)
	public String insert_Release_Log_1(Release_Log log, Model model) {		
		
		log.setProduct_Number("000000000000"); // 삭제 해야하는 코드
		
		int result = repository.insert_Release_Log_1(log);
		
		if(result == 0) {
			model.addAttribute("message", "출고기록 작성 실패");
			return "message";
		}
		return "redirect:/";
	}
	
	// 입고 기록 작성 후 데이터 초안 전송
	@RequestMapping(value="/stock_Log_Form_1", method=RequestMethod.POST)
	public String insert_Stock_Log_1(Stock_Log log, Model model) {
		
		log.setProduct_Number("000000000000"); // 삭제 해야하는 코드
		
		int result = repository.insert_Stock_Log_1(log);
		
		if(result == 0) {
			model.addAttribute("message", "입고기록 작성 실패");
			return "message";
		}
		return "redirect:/";
	}
}
