package com.main.lacj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.lacj.model.biz.Biz;

@Controller
public class LacjController {
//  index.html > login page

	@Autowired
	private Biz biz;
	
	@GetMapping("/regist")
	public String regist() {

		return "regist";
	}

	@GetMapping("/mypage")
	public String mypage() {

		return "mypage";
	}

	@RequestMapping("/mainlist")
	public String mainlist(Model model) {
		model.addAttribute("list", biz.selectList());
		
		return "mainlist";
	} 
	
	@GetMapping("/login")
	public String login() {
		
		
		return "login";
	}
		
	
}
