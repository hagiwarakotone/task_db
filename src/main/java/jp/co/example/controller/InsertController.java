package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jp.co.example.controller.form.InsertForm;

@Controller
public class InsertController {

	@RequestMapping("/insert")
	public String insertForm(@ModelAttribute("insertForm") InsertForm insertForm, Model model) {
		model.addAttribute("insertForm", new InsertForm());
		return "insert";
	}

	@RequestMapping(value = "/insertConfirm", method = RequestMethod.POST)
	public String insertForm(@Validated @ModelAttribute("insertForm") InsertForm insertForm,
			BindingResult bindingResult, Model model, HttpServletRequest request) {
		if (bindingResult.hasErrors()) {
			return "insert";
		} else {
			return "insertConfirm";

		}
	}
}