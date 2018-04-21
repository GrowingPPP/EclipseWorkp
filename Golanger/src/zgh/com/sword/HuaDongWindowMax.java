package zgh.com.sword;

import java.util.ArrayList;

public class HuaDongWindowMax {
	/*
	 * ��Ŀ���� ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
	 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
	 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
	 * {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}��
	 * {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
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
