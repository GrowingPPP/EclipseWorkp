package zgh.com.string;

public class String_buffer {
	public static void main(String[] args) {
		String str1 = new String("asd");
		char[] charArr = { '1', 'e', 'f', 'd' };
		String str2 = new String(charArr);
		// ��ָ���ַ������ӵ����ַ����Ľ�β��
		String str3 = str1.concat(str2);

		// System.out.println("str1:"+str1+'\n'+"str2:"+str2+'\n'+"str3:"+str3);

		// ����ָ���������� char ֵ
		char ch = str1.charAt(0);
		// System.out.println(ch);
		// ������ַ�������һ������Ƚ�,�������ʾ���
		int flag = str1.compareTo(new String("sd"));
		// System.out.println(flag);
		// ���ֵ�˳��Ƚ������ַ����������Ǵ�Сд
		int flag2 = str1.compareToIgnoreCase("ASD");
		// System.out.println(flag2);
		// ���ҽ����ַ�����ָ����StringBuffer����ͬ˳����ַ�ʱ�򷵻���
		boolean flag3 = str1.contentEquals("asd");
		// ����ָ�������б�ʾ���ַ����е� String
		String str4 = String.copyValueOf(charArr);
		// System.out.println(str4);

		boolean flag4 = str1.equals(str4);
		// ���Դ�Сд
		boolean flag5 = str1.equalsIgnoreCase(str4);
		// ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte ������
		byte[] by1 = str1.getBytes();
		// for (byte i : by1) {
		// System.out.println(i);
		// }

		// ���ش��ַ����Ĺ�ϣ��
		//System.out.println(str1.hashCode());
		
		
		int index = str1.indexOf("d");
		//System.out.println(index);
		
		//split() ��������ƥ�������������ʽ������ַ���
		String[] strA = (new String("123.3.5.6as.msd")).split("as\\.*");
		for(String i : strA){
			System.out.println(i);
		}
		/*
		       String str = new String("Welcome-to-Runoob");
		       
		        System.out.println("- �ָ�������ֵ :" );
		        for (String retval: str.split("-")){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        System.out.println("- �ָ������÷ָ��������ֵ :" );
		        for (String retval: str.split("-", 2)){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        String str2 = new String("www.runoob.com");
		        System.out.println("ת���ַ�����ֵ :" );
		        for (String retval: str2.split("\\.", 3)){
		            System.out.println(retval);
		        }
		 
		        System.out.println("");
		        String str3 = new String("acount=? and uu =? or n=?");
		        System.out.println("����ָ�������ֵ :" );
		        for (String retval: str3.split("and|or")){
		            System.out.println(retval);
		        }
		      */
		/*
		 * - �ָ�������ֵ :
				Welcome
				to
				Runoob
				
				- �ָ������÷ָ��������ֵ :
				Welcome
				to-Runoob
				
				ת���ַ�����ֵ :
				www
				runoob
				com
				
				����ָ�������ֵ :
				acount=? 
				 uu =? 
				 n=?
		 */
	//	String substring(int beginIndex)
	//	����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ�����
		
	//		String substring(int beginIndex, int endIndex)
	//		����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
			
	//		char[] toCharArray()
	//		�����ַ���ת��Ϊһ���µ��ַ����顣
		char[] s = str1.toCharArray();
		
		//String.valueOf(d) 
		/**
		 * static String valueOf(boolean b) 
				�� 
				static String valueOf(char c) 
				��
				static String valueOf(char[] data) 
				��
				static String valueOf(char[] data, int offset, int count) 
				��
				static String valueOf(double d) 
				��
				static String valueOf(float f) 
				��
				static String valueOf(int i)
				��
				static String valueOf(long l)
				��
				static String valueOf(Object obj) 
		 */
		
	}
}
