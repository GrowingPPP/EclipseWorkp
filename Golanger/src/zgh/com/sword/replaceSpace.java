package zgh.com.sword;

public class replaceSpace {
/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
