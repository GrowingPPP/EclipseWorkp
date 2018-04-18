package zgh.com.regex;

import java.util.regex.Matcher;

public class MatchTest {

	public static void main(String[] args) {
		// 邮箱正则表达式：^[a-zA-Z_]{1,}[0-9]{0,}@(?:(?:[a-zA-Z0-9]-*){1,}\\.){1,3}[a-zA-Z\\-]{1,}$
		// 邮政编码： ^[1-9]\d{5}$
		// 手机号码：^1[3|4|5|8][0-9]\d{8}$
		// String idPat =
		// "([0-9]{6})(18|19|20)?(\d{2})([01]\d)([0123]\d)(\d{3})(\d|X|x)?";
		// String urlPat =
		// "^((http|https)://)?([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$ ";
		String line = "viva_la_viva@nefuer.net";
		// String mail_pat =
		// "^[a-zA-Z_]{1,}[0-9]{0,}@(?:(?:[a-zA-Z0-9]-*){1,}\\.){1,3}[a-zA-Z\\-]{1,}$";
		String id = "141121188601280037";

		// Match match = new Match(id,idPat);

		// Matcher ma = match.matcher();
		// if(ma.find()){
		// System.out.println(ma.group(0));
		// }

		// match.MatcherPrintln();
	}

}
