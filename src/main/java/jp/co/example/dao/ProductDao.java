package jp.co.example.dao;

import java.util.List;

import jp.co.example.entity.Library;

public interface ProductDao {

	//一致する単語があるか（serch)
	boolean existVocabulary(String vocabulary);

	//レコードを挿入
	void insertLibrary(String vocabulary, String meaning);
	
	//該当のレコード一件を取ってくる
	List<Library> getRecord();

	//空欄submitによる全件検索
	List<Library> getAll();

}
