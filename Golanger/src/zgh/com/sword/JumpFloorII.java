//package zgh.com.sword;
//
//public class JumpFloorII {
///**
// *
//得出最终结论,在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：
//
//              | 1       ,(n=0 ) 
//
//f(n) =     | 1       ,(n=1 )
//
//              | 2*f(n-1),(n>=2)
// * @param args
// */
//	    public int JumpFloorII_Fun(int target) {
//	        if (target <= 0) {
//	            return -1;  
//	        } else if (target == 1) {
//	            return 1;
//	        } else {
//	            return 2 * JumpFloorII_Fun(target - 1);
//	        }
//	    }
//	public static void main(String[] args) {
//		
//	}
//
//}
