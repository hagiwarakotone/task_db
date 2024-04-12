package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.controller.form.serchForm;
import jp.co.example.dao.ProductDao;

@Controller
public class SerchController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/serchResult")

	public String serch(@ModelAttribute("serch") serchForm form, Model model) {

		System.out.println("検索ボタンが押されコントロールに到達");
		
		
		
		String vocabularys = form.getSerchName();

		//から文字だった場合
		if (vocabularys == null || vocabularys.isEmpty()) {
			model.addAttribute("VocAndMean", productDao.getAll());
			System.out.println("全件検索");
			return "serchResult";
			//入力された単語がなかった場合
		} else {
			boolean matchVoc = productDao.existVocabulary(vocabularys);
			//単語がある＝true,単語がない＝falseかをifで判定
			if (matchVoc == false) {
				model.addAttribute("noVocMassage", "※入力された単語が見つかりませんでした。");
				System.out.println("その単語ないです");
				return "serch";
			} else {
				model.addAttribute("VocAndMean", matchVoc);
				System.out.println("一件発見");
				return "serchResult";
			}

		}
	}

}
