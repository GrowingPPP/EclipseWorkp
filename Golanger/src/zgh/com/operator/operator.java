package zgh.com.operator;

public class operator {

	public static void main(String[] args) {
		
		/**
		 * instanceof ���������������ڲ�������ʵ�������ö����Ƿ���һ���ض����ͣ������ͻ�ӿ����ͣ���
		 */
		String name = "James";
		boolean result = name instanceof String; // ���� name �� String ���ͣ����Է�����
		//result = true
		
		
	     int a = 10;
	     int b = 20;
	     int c = 25;
	     int d = 25;
	     System.out.println("a + b = " + (a + b) );
	     System.out.println("a - b = " + (a - b) );
	     System.out.println("a * b = " + (a * b) );
	     System.out.println("b / a = " + (b / a) );
	     System.out.println("b % a = " + (b % a) );
	     System.out.println("c % a = " + (c % a) );
	     System.out.println("a++   = " +  (a++) );
	     System.out.println("a--   = " +  (a--) );
	     // �鿴  d++ �� ++d �Ĳ�ͬ
	     System.out.println("d++   = " +  (d++) );
	     System.out.println("++d   = " +  (++d) );
	     
	     
	     a = 60; /* 60 = 0011 1100 */ 
	     b = 13; /* 13 = 0000 1101 */
	     c = 0;
	     c = a & b;       /* 12 = 0000 1100 *///	������Ӧλ����1������Ϊ1������Ϊ0
	     System.out.println("a & b = " + c );
	 
	     c = a | b;       /* 61 = 0011 1101 *///	������Ӧλ����0������Ϊ0������Ϊ1
	     System.out.println("a | b = " + c );
	 
	     c = a ^ b;       /* 49 = 0011 0001 */ //	������Ӧλֵ��ͬ������Ϊ0������Ϊ1
	     System.out.println("a ^ b = " + c );
	 
	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );
	 
	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );
	 
	     c = a >> 2;     /* 15 = 1111 */
	     System.out.println("a >> 2  = " + c );
	  
	     c = a >>> 2;     /* 15 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	     
	     
	     
	     a = 10;
	     b = 20;
	     c = 0;
	     c = a + b;
	     System.out.println("c = a + b = " + c );
	     c += a ;
	     System.out.println("c += a  = " + c );
	     c -= a ;
	     System.out.println("c -= a = " + c );
	     c *= a ;
	     System.out.println("c *= a = " + c );
	     a = 10;
	     c = 15;
	     c /= a ;
	     System.out.println("c /= a = " + c );
	     a = 10;
	     c = 15;
	     c %= a ;
	     System.out.println("c %= a  = " + c );
	     c <<= 2 ;
	     System.out.println("c <<= 2 = " + c );
	     c >>= 2 ;
	     System.out.println("c >>= 2 = " + c );
	     c >>= 2 ;
	     System.out.println("c >>= a = " + c );
	     c &= a ;
	     System.out.println("c &= 2  = " + c );
	     c ^= a ;
	     System.out.println("c ^= a   = " + c );
	     c |= a ;
	     System.out.println("c |= a   = " + c );
	     
	     
	      a = 10;
	      // ��� a ���� 1 ������������ b Ϊ 20������Ϊ 30
	      b = (a == 1) ? 20 : 30;
	      System.out.println( "Value of b is : " +  b );
	 
	      // ��� a ���� 10 ������������ b Ϊ 20������Ϊ 30
	      b = (a == 10) ? 20 : 30;
	      System.out.println( "Value of b is : " + b );
	}

}
