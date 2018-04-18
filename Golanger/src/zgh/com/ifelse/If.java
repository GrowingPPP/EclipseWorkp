package zgh.com.ifelse;

public class If {
  /*
  * if(布尔表达式 1){
	   		//如果布尔表达式 1的值为true执行代码
		}else if(布尔表达式 2){
		   //如果布尔表达式 2的值为true执行代码
		}else if(布尔表达式 3){
		   //如果布尔表达式 3的值为true执行代码
		}else {
		   //如果以上布尔表达式都不为true执行代码
		}
   */
	public void Switch(){
		/**
		 * 良好
		    你的等级是 C
		 */
		      char grade = 'C';
		      switch(grade)
		      {
		         case 'A' :
		            System.out.println("优秀"); 
		            break;
		         case 'B' :
		         case 'C' :
		            System.out.println("良好");
		            break;
		         case 'D' :
		            System.out.println("及格");
		         case 'F' :
		            System.out.println("你需要再努力努力");
		            break;
		         default :
		            System.out.println("未知等级");
		      }
		      System.out.println("你的等级是 " + grade);
	}
}
