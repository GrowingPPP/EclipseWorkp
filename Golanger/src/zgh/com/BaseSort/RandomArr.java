package zgh.com.BaseSort;

public class RandomArr {
	private RandomArr(){
		
	}
	public static int[] randomArrayFactory(int n,int arrayL,int arrayR){
		int[] arr = new int[n];
		for(int i = 0; i < n;i++){
			arr[i] = (int)(Math.random()*(arrayR - arrayL +1))+arrayL;
		}
		return arr;
	}
	
	public static int[] arrayCopy(int[] arr1,int n){
		int[] arr = new int[n];
		arr = arr1.clone();
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = RandomArr.randomArrayFactory(100, 20, 189);
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		int[] arr1 = RandomArr.arrayCopy(arr, 100);
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}
