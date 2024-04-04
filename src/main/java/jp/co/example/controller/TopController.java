package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//最初のTop.jspの表示からnemu.jspの画面遷移

@Controller
public class TopController {
	//http://localhost:8080/でtop.jspを表示
	@RequestMapping("/")
	public String showTop() {
		return "top";
	}

	@RequestMapping("/menu")
	public String showMemu() {
		return "menu";
	}

	@RequestMapping("/serch")
	public String showSerch() {
		return "serch";
	}

	@RequestMapping("/insert")
	public String showInsrt() {
		return "insert";
	}
}