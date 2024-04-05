package jp.co.example.controller.form;

import javax.validation.constraints.NotBlank;

public class InsertForm {

	@NotBlank
	private String vocabulary;
	@NotBlank
	private String meaning;
	
	

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

}
