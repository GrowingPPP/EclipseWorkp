package zgh.com.sword;

public class FrogDump {
	/**
	 * 
	 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
	 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
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
