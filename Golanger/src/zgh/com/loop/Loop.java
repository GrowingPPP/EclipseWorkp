package zgh.com.loop;

public class Loop {
	/**
	 * 	break �ؼ���
		break ��Ҫ����ѭ�������� switch ����У����������������顣

		break ����������ѭ�������Ҽ���ִ�и�ѭ���������䡣
		
		
		continue �ؼ���
		continue �������κ�ѭ�����ƽṹ�С��������ó���������ת����һ��ѭ���ĵ�����
		
		�� for ѭ���У�continue ���ʹ����������ת��������䡣
		
		�� while ���� do��while ѭ���У�����������ת���������ʽ���ж���䡣
	 */
	
	
	
	/*
	 * for
	 */
	public void ForTest(){
		for(int x = 10; x < 20; x = x+1) {
		         System.out.print("value of x : " + x );
		         
		         //break;
		         System.out.print("\n");
		      }
	}
	/*
	 * strengthenFor
	 */
	public void StrengthenForTest(){
		int [] numbers = {10, 20, 30, 40, 50};
		 
		      for(int x : numbers ){
		         System.out.print( x );
		         System.out.print(",");
		      }
		      System.out.print("\n");
		      String [] names ={"James", "Larry", "Tom", "Lacy"};
		      for( String name : names ) {
		         System.out.print( name );
		         System.out.print(",");
		      }
	}
	/*
	 * while
	 */
	public void WhileTest(){
		/*
		 * 	value of x : 10
			value of x : 11
			value of x : 12
			value of x : 13
			value of x : 14
			value of x : 15
			value of x : 16
			value of x : 17
			value of x : 18
			value of x : 19
		 */
	      int x = 10;
	      while( x < 20 ) {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }
	}
	/*
	 * do while
	 */
	public void DoWhile(){
		     int x = 10;
		     
		      do{
		         System.out.print("value of x : " + x );
		         x++;
		         System.out.print("\n");
		      }while( x < 20 );
	}
}
