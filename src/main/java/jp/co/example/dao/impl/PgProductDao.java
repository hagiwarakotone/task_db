package jp.co.example.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.ProductDao;
import jp.co.example.entity.Library;

@Repository
public class PgProductDao implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//空欄submitによる全件検索
	public List<Library> getAll() {
		List<Library> libList = new ArrayList<>();
		String sql = "SELECT * FROM vocabulary";
		libList=jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Library.class));
		return libList;
	}

	//一致する単語があるか（serch)
	@Override
	public boolean existVocabulary(String vocabularys) {
		String sql = "SELECT COUNT(*)FROM vocabulary WHERE vocabularys=?";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class, vocabularys);
		return count != null && count > 0;
	}

	//レコードを挿入
	@Override
	public void insertLibrary(String vocabularys, String meaning) {
		String sql = "INSERT INTO vocabulary (vocabularys,meaning)VALUES(?,?)";
		jdbcTemplate.update(sql, vocabularys, meaning);
	}

	//該当のレコード一件を取ってくる
	@Override
	public List<Library> getRecord(String vocablarys) {
		String sql = "SELECT vocabularys,meaning FROM vocabulary WHERE vocabularys=?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		List<Library> recordList = new ArrayList<>();
		for (Map<String, Object> row : rows) {
			Library lib = new Library();
			lib.setVocabularys((String) row.get("vocabulary"));
			lib.setMeaning((String) row.get("meaning"));
			recordList.add(lib);
		}
		return recordList;
	}
}
