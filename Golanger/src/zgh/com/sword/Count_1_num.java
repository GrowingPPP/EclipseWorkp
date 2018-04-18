package zgh.com.sword;

public class Count_1_num {

/**
 * 题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
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
