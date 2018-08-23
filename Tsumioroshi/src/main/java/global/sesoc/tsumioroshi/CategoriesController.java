package global.sesoc.tsumioroshi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.tsumioroshi.dao.CategoriesRepository;
import global.sesoc.tsumioroshi.util.HexConverter;
import global.sesoc.tsumioroshi.vo.FirstCategory;
import global.sesoc.tsumioroshi.vo.SecondCategory;

@Controller
public class CategoriesController {
	@Autowired
	CategoriesRepository repositoy;

	HexConverter converter = new HexConverter();

	@RequestMapping(value = "categories", method = RequestMethod.GET)
	public String categoriesMenu() {

		return "category/createcategory";
	}

	@RequestMapping(value = "selectAllFirst", method = RequestMethod.POST)
	public @ResponseBody List<FirstCategory> selectAllFirst() {
		List<FirstCategory> list = repositoy.selectAllFirst();

		return list;
	}

	@RequestMapping(value = "selectByNameFirst", method = RequestMethod.POST)
	public @ResponseBody FirstCategory selectByNameFirst(FirstCategory first) {
		FirstCategory result = repositoy.selectByNameFirst(first);

		return result;
	}

	@RequestMapping(value = "createFirst", method = RequestMethod.POST)
	public @ResponseBody int createFirst(FirstCategory first) {
		FirstCategory firstResult = repositoy.selectLastFirst();
		if (firstResult == null) {
			first.setFc_code("0000");
		} else {
			String lastcode = converter.hexToDec(firstResult.getFc_code());
			String nextcode = converter.decToHex(converter.codeAdder(lastcode));
			first.setFc_code(nextcode);
		}
		int result = repositoy.insertFirst(first);

		return result;
	}
	
	@RequestMapping(value = "selectByNameSecond", method = RequestMethod.POST)
	public @ResponseBody SecondCategory selectByNameSecond(SecondCategory second) {
		SecondCategory result = repositoy.selectByNameSecond(second);

		return result;
	}
	
	@RequestMapping(value = "createSecond", method = RequestMethod.POST)
	public @ResponseBody int createSecond(SecondCategory second) {
		SecondCategory secondResult = repositoy.selectLastSecond(second);
		if (secondResult == null) {
			second.setSc_code("0000");
		} else {
			String lastcode = converter.hexToDec(secondResult.getSc_code());
			String nextcode = converter.decToHex(converter.codeAdder(lastcode));
			second.setSc_code(nextcode);
		}
		int result = repositoy.insertSecond(second);

		return result;
	}
	
	@RequestMapping(value = "selectSecond", method = RequestMethod.POST)
	public @ResponseBody List<SecondCategory> selectSecond(SecondCategory second) {
		List<SecondCategory> list = repositoy.selectSecond(second);

		return list;
	}
	
	@RequestMapping(value = "selectByFcCodeSecond", method = RequestMethod.POST)
	public @ResponseBody List<SecondCategory> selectByFcCodeSecond(SecondCategory second){
		List<SecondCategory> list = repositoy.selectByFcCodeSecond(second);
		System.out.println(list);
		
		return list;
	}
}
