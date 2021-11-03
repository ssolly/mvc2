package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller : 연결 

@Controller	
public class MemberController {
	
	@Autowired
	@Qualifier("mmm")		//mmm이름을 가진 bean을 넣어줄 것
	MemberService ms;
	
// java문법 스타일
//	@RequestMapping("insert")
//	public String insert(Model model) {
//		ms = new MemberService();
//		int result = ms.insert();
//		model.addAttribute("result",result);
//		return "di/index";
//	}
	
	@RequestMapping("insert")
	public String insert(Model model) {
		int result = ms.insert();
		System.out.println("ms : " + ms);
		model.addAttribute("result",result);
		return "di/index";
	}
}
