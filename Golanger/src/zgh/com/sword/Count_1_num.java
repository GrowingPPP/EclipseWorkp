package zgh.com.sword;

public class Count_1_num {

/**
 * ��Ŀ����
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * @param n
 * @return
 */
	public static int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while(flag != 0){
			if((n & flag )!= 0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
	public static int Number(int n) {
		int count = 0;
		while(n != 0){
			count++;
			n = n&(n-1);
		}
		return count;
	}
	public static void main(String[] args) {
		int count = Count_1_num.NumberOf1(10);
		System.out.println(count);
	}

}
