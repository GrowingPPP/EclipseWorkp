package zgh.com.BaseSort;

public class PopSort {
	public static void sort(int[] arr,int n){
		for( int i = 0 ; i < n -1 ; i ++){
			for(int j = n - 2;j >= 0;j--){
				if(arr[j] > arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int tmp  = 0;
		tmp = arr[j];
		arr[j] = arr[i];
		arr[i]  = tmp;
	}
	public static void main(String[] args) {
		int[] arr = RandomArr.randomArrayFactory(10, 2, 90);
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		PopSort.sort(arr, 10);
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}
