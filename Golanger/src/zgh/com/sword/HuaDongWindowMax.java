package zgh.com.sword;

import java.util.ArrayList;

public class HuaDongWindowMax {
	/*
	 * 题目描述 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
	 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
	 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
	 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
	 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
	 */
	public  static ArrayList<Integer> maxInWindows(int [] num, int size)
	{
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		if(size <= 0){
			return arr;
		}
	        int max = 0;
	        int s = size;
	        int cishu = num.length-size + 1;
	        for(int i = 0;i < cishu;i++){
		       max = num[i];
		       int j = i;
		       while(size > 0){
			       if( num[j] > max ){
				       max = num[j];
			       }
			       j++;
			       size--;
		       }
		       arr.add(max);
		       size = s;
	        }
	       
	        return arr;
	       
	}
	public static void main(String[] args) {
		int[] a = {2,3,4,2,6,2,5,1};
		int[] b = {10,14,12,11};
		int sizeb = 0;
		int size = 3;
		ArrayList<Integer> arr = maxInWindows(b,sizeb);
		System.out.println(arr.toString());
	}

}
