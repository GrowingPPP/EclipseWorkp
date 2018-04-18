package zgh.com.BaseSort;

public class SelectSort {
	public static void sort(int[] arr,int n){
		for(int i = 0; i < n ;i++){
			int minIndex = i;
			for(int j = i+1;j < n;j++ ){
				if(arr[minIndex] > arr[j]){
					minIndex = j;
				}
			}
			if(minIndex != i){
				swap(arr,i,minIndex);
			}
			
		}
	}
	
	private static void swap(int[] arr, int i, int minIndex) {
		int tmp = 0;
		tmp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = RandomArr.randomArrayFactory(10, 2, 90);
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		SelectSort.sort(arr, 10);
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}
