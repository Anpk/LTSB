package global.sesoc.tsumioroshi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.tsumioroshi.dao.MemberRepositoy;
import global.sesoc.tsumioroshi.vo.Members;

@Controller
public class MemberController {

	@Autowired
	MemberRepositoy repository;
	
	@RequestMapping(value="memberMenu", method=RequestMethod.GET)
	public String membermenu() {
		
		return "member/memberMenu";
	}
	
	@RequestMapping(value="listOffice", method=RequestMethod.POST)
	public @ResponseBody List<Members> listOffice(){
		List<Members> list = repository.listOffice();
		
		return list;
	}
	
	@RequestMapping(value="listWareHouse", method=RequestMethod.POST)
	public @ResponseBody List<Members> listWareHouse(){
		List<Members> list = repository.listWareHouse();
		
		return list;
	}
	
	@RequestMapping(value="deleteMember", method=RequestMethod.POST)
	public @ResponseBody int deleteMember(Members member){
		int result = repository.deleteMember(member);
		
		return result;
	}
	
	@RequestMapping(value="insertMember", method=RequestMethod.GET)
	public String insertMember() {
		
		return "member/insertMember";
	}
	
	@RequestMapping(value="idCheck", method=RequestMethod.POST)
	public @ResponseBody String idCheck(Members member) {
		Members check = repository.idCheck(member);
		String result ="";
		if(check == null) {
			result = "true";
			
			return result;
		}else {
			result = "false";
			
			return result;
		}
	}
}
