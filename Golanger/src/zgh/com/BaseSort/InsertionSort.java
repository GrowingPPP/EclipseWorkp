package zgh.com.BaseSort;

public class InsertionSort {
	public static void sort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			// 寻找元素arr【i】合适的插入位置
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else
					break;
			}
		}
	}

	public static void gaijinsort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			// 寻找元素arr【i】合适的插入位置
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}

	public static void yousort(int[] arr, int n) {
		int j;//j保存元素e应该插入的位置
		for (int i = 1; i < n; i++) {
			int e = arr[i];
			for ( j = i; j > 0 && arr[j - 1] > e; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = e;
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int tmp = 0;
		tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = RandomArr.randomArrayFactory(10, 2, 90);
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		InsertionSort.yousort(arr, 10);
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}
