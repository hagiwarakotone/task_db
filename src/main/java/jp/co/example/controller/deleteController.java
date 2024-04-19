package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.example.controller.form.TopForm;
import jp.co.example.dao.ProductDao;

@Controller
public class deleteController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteForm(Model model, TopForm topForm) {

		String deleteVoc = topForm.getVocabularys();
		String deleteMean = topForm.getMeaning();
		productDao.deleteLibrary(deleteVoc, deleteMean);
		return "delete";
	}

}
