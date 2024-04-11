package jp.co.example.entity;

//Entity=実際の実体や存在のことオブジェクトやインスタンスと同じスタンス
public class Library {

	//検索、登録したものは全てLibrary型で扱う

	private String vocabularys;
	private String meaning;

	public String getVocabularys() {
		return vocabularys;
	}

	public void setVocabularys(String vocabularys) {
		this.vocabularys = vocabularys;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
}
