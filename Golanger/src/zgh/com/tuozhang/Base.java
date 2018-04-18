package zgh.com.tuozhang;

public class Base {
/**
 * 
 */
	
	public static boolean findKey(int[][] arr,int key){
		int i = arr.length-1;
		int j = 0;
		while(i>=0&&j<=arr[0].length-1){
			if(arr[i][j] == key){
				return true;
			}else if(arr[i][j] > key){
				i--;
			}else{
				j++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int key =10;
		boolean s= findKey(arr, key);
		System.out.println(s);
	}
}
