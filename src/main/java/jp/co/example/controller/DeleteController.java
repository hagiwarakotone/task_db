package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.controller.form.DeleteForm;
import jp.co.example.dao.ProductDao;

@Controller
public class DeleteController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = "/delete")
	public String deleteForm(@ModelAttribute("vocabularys") DeleteForm deleteForm, Model model) {

		System.out.println("削除ボタンぽちっとな");

		String vocabularys = deleteForm.getVocabularys();
		System.out.println("controller:" + vocabularys);

		productDao.deleteLibrary(vocabularys);

		model.addAttribute("delete", vocabularys);
		System.out.println("1:" + vocabularys);

		System.out.println("削除完了");

		return "delete";
	}

}
