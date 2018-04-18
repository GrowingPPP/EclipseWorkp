package zgh.com.sword;

public class FrogDump {
	/**
	 * 
	 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
	 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
	 * @param target
	 * @return
	 */
        public int JumpFloor(int target) {
        	int count = 0;
		if(target == 0){
			return 0;
		}else if(target == 1){
			return 1;
		}else if(target == 2){
			return 2;
		}else if(target > 2){
			count =  JumpFloor(target-1)+JumpFloor(target-2);
		}
		return count;
		
        }

	public static void main(String[] args) {
		
	}

}
