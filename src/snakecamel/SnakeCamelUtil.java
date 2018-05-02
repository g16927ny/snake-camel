package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");//_によってSnake_caseという文字列を区切りそれをwordsという配列の要素とする
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {//文字列camelcaseを定義
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {//文字列camelcaseの長さの回数まわす
			char c = camelcase.charAt(i);//0番目から順に見ていく
			if (Character.isUpperCase(c)) {//もし文字列camelcaseのi番目(c)が大文字だったら
				sb.append(camelcase.substring(j, i));//文字列camelcaseのj番目からi番目をsbに追加
				if (sb.length() > 0) {//もし文字列sbの長さが0より大きかったら
					sb.append("_");//sbに"_"を追加していく
				}
				sb.append(Character.toLowerCase(c));//文字列camelcaseのi番目(c)を小文字にしてsbに追加
				j = i;//ここでjをiとする
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);//文字列の0番目(先頭)をfirstとする
		char upperFirst = Character.toUpperCase(first);//firstを大文字に変換しそれをupperFirstとする
		String rest = s.substring(1);//文字列sの1番目(先頭の文字の次)以降の文字列をrestとする
		return upperFirst + rest;//sの頭文字を大文字にした文字列をかえす
	}
//以下は上のcapitalizeの小文字にするバージョン
	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
