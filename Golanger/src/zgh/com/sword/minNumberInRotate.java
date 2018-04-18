package zgh.com.sword;

import java.util.ArrayList;

public class minNumberInRotate {
	public int minNumberInRotateArray(int[] array){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(array.length == 0){
			return 0;
			
		}
		int i = array[0];
		for(int j : array){
			if(i>j){
				i = j;
			}
		}
		return i;
		
	}
}
