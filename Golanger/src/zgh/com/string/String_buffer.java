package zgh.com.string;

public class String_buffer {
	public static void main(String[] args) {
		String str1 = new String("asd");
		char[] charArr = { '1', 'e', 'f', 'd' };
		String str2 = new String(charArr);
		// 将指定字符串连接到此字符串的结尾。
		String str3 = str1.concat(str2);

		// System.out.println("str1:"+str1+'\n'+"str2:"+str2+'\n'+"str3:"+str3);

		// 返回指定索引处的 char 值
		char ch = str1.charAt(0);
		// System.out.println(ch);
		// 把这个字符串和另一个对象比较,返回零表示相等
		int flag = str1.compareTo(new String("sd"));
		// System.out.println(flag);
		// 按字典顺序比较两个字符串，不考虑大小写
		int flag2 = str1.compareToIgnoreCase("ASD");
		// System.out.println(flag2);
		// 当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真
		boolean flag3 = str1.contentEquals("asd");
		// 返回指定数组中表示该字符序列的 String
		String str4 = String.copyValueOf(charArr);
		// System.out.println(str4);

		boolean flag4 = str1.equals(str4);
		// 忽略大小写
		boolean flag5 = str1.equalsIgnoreCase(str4);
		// 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
		byte[] by1 = str1.getBytes();
		// for (byte i : by1) {
		// System.out.println(i);
		// }

		// 返回此字符串的哈希码
		//System.out.println(str1.hashCode());
		
		
		int index = str1.indexOf("d");
		//System.out.println(index);
		
		//split() 方法根据匹配给定的正则表达式来拆分字符串
		String[] strA = (new String("123.3.5.6as.msd")).split("as\\.*");
		for(String i : strA){
			System.out.println(i);
		}
		/*
		       String str = new String("Welcome-to-Runoob");
		       
		        System.out.println("- 分隔符返回值 :" );
		        for (String retval: str.split("-")){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        System.out.println("- 分隔符设置分割份数返回值 :" );
		        for (String retval: str.split("-", 2)){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        String str2 = new String("www.runoob.com");
		        System.out.println("转义字符返回值 :" );
		        for (String retval: str2.split("\\.", 3)){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        String str3 = new String("acount=? and uu =? or n=?");
		        System.out.println("多个分隔符返回值 :" );
		        for (String retval: str3.split("and|or")){
		            System.out.println(retval);
		        }
		      */
		/*
		 * - 分隔符返回值 :
				Welcome
				to
				Runoob
				
				- 分隔符设置分割份数返回值 :
				Welcome
				to-Runoob
				
				转义字符返回值 :
				www
				runoob
				com
				
				多个分隔符返回值 :
				acount=? 
				 uu =? 
				 n=?
		 */
	//	String substring(int beginIndex)
	//	返回一个新的字符串，它是此字符串的一个子字符串。
		
	//		String substring(int beginIndex, int endIndex)
	//		返回一个新字符串，它是此字符串的一个子字符串。
			
	//		char[] toCharArray()
	//		将此字符串转换为一个新的字符数组。
		char[] s = str1.toCharArray();
		
		//String.valueOf(d) 
		/**
		 * static String valueOf(boolean b) 
				或 
				static String valueOf(char c) 
				或
				static String valueOf(char[] data) 
				或
				static String valueOf(char[] data, int offset, int count) 
				或
				static String valueOf(double d) 
				或
				static String valueOf(float f) 
				或
				static String valueOf(int i)
				或
				static String valueOf(long l)
				或
				static String valueOf(Object obj) 
		 */
		
	}
}
