package jp.co.example.entity;

//Entity=実際の実体や存在のことオブジェクトやインスタンスと同じスタンス
public class Library {

	//検索、登録したものは全てLibrary型で扱う

	private String vocabulary;
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
