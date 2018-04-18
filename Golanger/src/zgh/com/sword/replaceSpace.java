package zgh.com.sword;

public class replaceSpace {
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s  = new StringBuffer("asd sd d s ");
		String ss = replaceSpaceFun(s);
			System.out.println(ss);
	}
	public static String replaceSpaceFun(StringBuffer str) {
		String s = str.toString();
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer("");
		for(char c : ch ){
			if(c == ' '){
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
		return sb.toString();
		    	
	}
}
