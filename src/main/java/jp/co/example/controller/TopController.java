package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.controller.form.InsertForm;
import jp.co.example.controller.form.SerchForm;

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