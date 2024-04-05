package jp.co.example.utility;

import java.util.ArrayList;

import jp.co.example.entity.Library;

//Utility＝規模が小さく簡潔で、補助的な機能を提供するプログラム
public class Utility {
	//listという名前でLibrary型が入るListを作成
	private ArrayList<Library> list;

	//Listにaddして追加するのに便利なので先に作っておく
	public void add(Library l) {
		list.add(l);
	}

	public Library get(int s) {
		return list.get(s);
	}

	//中身がnullまたは空文字かの判定

	public static boolean isNullOrEmpty(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
