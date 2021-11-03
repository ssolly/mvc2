package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller : 연결 

@Controller	
public class MemberController {
	MemberService ms;
	
	@RequestMapping("insert")
	public String insert(Model model) {
		ms = new MemberService();
		int result = ms.insert();
		model.addAttribute("result",result);
		return "di/index";
	}
}
