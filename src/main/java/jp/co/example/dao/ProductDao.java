package jp.co.example.dao;

import java.util.List;

import jp.co.example.entity.Library;

public interface ProductDao {

	//一致する単語があるか（serch)○
	boolean existVocabulary(String vocabularys);

	//レコードを挿入○
	void insertLibrary(String vocabularys, String meaning);

	//該当のレコード一件を取ってくる
	List<Library> getRecord(String vocablarys);

	//空欄submitによる全件検索○
	List<Library> getAll();

}
