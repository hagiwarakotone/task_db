package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.controller.form.InsertForm;
import com.example.controller.form.SerchForm;

@Controller
public class topController {

	@RequestMapping("/")
	public String showTop() {
		return "top";
	}

	@RequestMapping("/serch")
	public String showSerch(Model model) {
		model.addAttribute("serch", new SerchForm());
		return "serch";
	}

	@RequestMapping("/insert")
	public String showInsrt(Model model) {
		model.addAttribute("insert", new InsertForm());
		return "insert";
	}
}
