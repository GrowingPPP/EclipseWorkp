package zgh.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
	private static String str;
	private static String pat;
	private static Matcher match;
	public  Match(String str,String pat) {
		this.str = str;
		this.pat = pat;
	}
	public Match(){};
	public Matcher matcher(){
		match =  Pattern.compile(pat).matcher(str);
		return match;
	}
	
	public void MatcherPrintln(){
		matcher();
		if(match.find()){
			
			System.out.println(match.group());
		}else{
			System.out.println("没有合适的匹配");
		}
	}
}
