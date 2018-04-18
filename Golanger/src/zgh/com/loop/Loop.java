package zgh.com.loop;

public class Loop {
	/**
	 * 	break 关键字
		break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

		break 跳出最里层的循环，并且继续执行该循环下面的语句。
		
		
		continue 关键字
		continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
		
		在 for 循环中，continue 语句使程序立即跳转到更新语句。
		
		在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
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
