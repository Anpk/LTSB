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
	
	// ��� ��� �ۼ� �� ȭ�� ȣ��
	@RequestMapping(value = "/release_Log_Form_1", method = RequestMethod.GET)
	public String release_Log(Locale locale, Model model) {		
		return "log/release_Log_Form_1";
	}
	
	// �԰� ��� �ۼ� �� ȭ�� ȣ��
	@RequestMapping(value = "/stock_Log_Form_1", method = RequestMethod.GET)
	public String stock_Log(Locale locale, Model model) {		
		return "log/stock_Log_Form_1";
	}

	// ��� ��� �ۼ� �� ������ �ʾ� ����
	@RequestMapping(value="/release_Log_Form_1", method=RequestMethod.POST)
	public String insert_Release_Log_1(Release_Log log, Model model) {		
		
		log.setProduct_Number("000000000000"); // ���� �ؾ��ϴ� �ڵ�
		
		int result = repository.insert_Release_Log_1(log);
		
		if(result == 0) {
			model.addAttribute("message", "����� �ۼ� ����");
			return "message";
		}
		return "redirect:/";
	}
	
	// �԰� ��� �ۼ� �� ������ �ʾ� ����
	@RequestMapping(value="/stock_Log_Form_1", method=RequestMethod.POST)
	public String insert_Stock_Log_1(Stock_Log log, Model model) {
		
		log.setProduct_Number("000000000000"); // ���� �ؾ��ϴ� �ڵ�
		
		int result = repository.insert_Stock_Log_1(log);
		
		if(result == 0) {
			model.addAttribute("message", "�԰��� �ۼ� ����");
			return "message";
		}
		return "redirect:/";
	}
}
