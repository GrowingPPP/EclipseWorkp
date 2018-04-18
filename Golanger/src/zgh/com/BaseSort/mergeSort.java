package zgh.com.BaseSort;

public class mergeSort {
	 static void sort(int[] arr, int n) {
		__mergeSort(arr, 0, n - 1);
	}

	// �ݹ�ʹ�ù鲢���򣬶�arr[l...r]�ķ�Χ��������
	private static void __mergeSort(int[] arr, int l, int r) {
		if (l >= r)
			return;
		//���������С�Ļ������Խ��鲢������Ƕ���������Ч�ʸ���
		if((r - l)< 100){
			insertionSort(arr,l,r);
		}
		int mid = (l + r) / 2;
		__mergeSort(arr, l, mid);
		__mergeSort(arr, mid + 1, r);
		__merge(arr, l, mid, r);
	}

	private static void insertionSort(int[] arr, int l, int r) {
		int j;
		for(int i = l+1;i<=r;i++){
			int e = arr[i];
			for(j = i;j < l&&arr[j-1]>e;j--){
				arr[j] = arr[j-1];
			}
			arr[j] = e;
		}
	}

	// ��arr[l....mid]��arr[mid+1....r]�����ֽ��й鲢
	private static void __merge(int[] arr, int l, int mid, int r) {
		int[] aux = new int[r-l+1];
		// aux������arr[l....r]�ĸ���
		for (int i = l; i <= r; i++)
			aux[i - l] = arr[i];

		int i = l, j = mid + 1;
		for (int k = l; k <= r; k++) {

			if (i > mid) {
				arr[k] = aux[j - l];
				j++;
			} else if (j > r) {
				arr[k] = aux[i - l];
				i++;
			} else if (aux[i - l] < aux[j - l]) {
				arr[k] = aux[i - l];
				i++;
			} else {
				arr[k] = aux[j - l];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = RandomArr.randomArrayFactory(n, 0, 99);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		mergeSort.sort(arr, n);
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
