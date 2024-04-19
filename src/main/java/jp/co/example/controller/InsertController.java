package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.example.controller.form.InsertForm;
import jp.co.example.dao.ProductDao;

@Controller
public class InsertController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = "/insertConfirm", method = RequestMethod.POST)
	public String insertForm(@ModelAttribute("insert") InsertForm insertForm, Model model) {

		String vocabularys = insertForm.getInsertVocabularys();
		String meaning = insertForm.getInsertMeaning();

		if ((vocabularys == null || vocabularys.isEmpty()) && (meaning == null || meaning.isEmpty())) {
			System.out.println("どっちも空欄のままボタン押しやがったな");
			model.addAttribute("errorInsert", "※単語名と意味はどちらも必須入力です！");
			return "insert";
		} else if (vocabularys == null || vocabularys.isEmpty()) {
			System.out.println("単語名が空欄のままボタン押しやがったな");
			model.addAttribute("errorInsert", "※単語名は必須入力です！");
			return "insert";

		} else if (meaning == null || meaning.isEmpty()) {
			System.out.println("意味が空欄のままボタンを押しやがったな");
			model.addAttribute("errorMean", "※意味は必須入力です！");
			return "insert";
		} else {

			boolean matchVoc = productDao.existVocabulary(vocabularys);
			if (matchVoc == true) {
				System.out.println("重複単語だよ〜〜");
				model.addAttribute("errorInsert", "※この単語は既にあるのだ！");
				return "insert";
			} else {
				productDao.insertLibrary(vocabularys, meaning);
				System.out.println("全部合格〜新しく追加するよ〜〜");
				return "insertConfirm";

			}
		}
	}
}