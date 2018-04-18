package zgh.com.math;

public class MathTest {
	public static void main(String[] args) {
		Integer a = 10;
		System.out.println(a.equals(9));
		System.out.println(a.doubleValue());
		System.out.println(a.compareTo(new Integer(4)));
		System.out.println(a.floatValue());
		System.out.println(a.hashCode());
		System.out.println(a.bitCount(3));
		
		
	        Integer x =Integer.valueOf(9);
	        Double c = Double.valueOf(5);
	        Float ss = Float.valueOf("80");               

	        Integer b = Integer.valueOf("444",16);   // 使用 16 进制

	        System.out.println(x); 
	        System.out.println(c);
	        System.out.println(ss);
	        System.out.println(b);
	}
}
