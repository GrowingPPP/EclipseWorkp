package zgh.com.operator;

public class operator {

	public static void main(String[] args) {
		
		/**
		 * instanceof 运算符该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
		 */
		String name = "James";
		boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
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
	     // 查看  d++ 与 ++d 的不同
	     System.out.println("d++   = " +  (d++) );
	     System.out.println("++d   = " +  (++d) );
	     
	     
	     a = 60; /* 60 = 0011 1100 */ 
	     b = 13; /* 13 = 0000 1101 */
	     c = 0;
	     c = a & b;       /* 12 = 0000 1100 *///	如果相对应位都是1，则结果为1，否则为0
	     System.out.println("a & b = " + c );
	 
	     c = a | b;       /* 61 = 0011 1101 *///	如果相对应位都是0，则结果为0，否则为1
	     System.out.println("a | b = " + c );
	 
	     c = a ^ b;       /* 49 = 0011 0001 */ //	如果相对应位值相同，则结果为0，否则为1
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
	      // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
	      b = (a == 1) ? 20 : 30;
	      System.out.println( "Value of b is : " +  b );
	 
	      // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
	      b = (a == 10) ? 20 : 30;
	      System.out.println( "Value of b is : " + b );
	}

}
