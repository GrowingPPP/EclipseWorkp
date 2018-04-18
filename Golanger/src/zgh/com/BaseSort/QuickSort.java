package zgh.com.BaseSort;

public class QuickSort {
	public static void sort(int[] arr, int n) {
		quickSort(arr, 0, n - 1);
	}

	// ��arr[l...r]���ֽ��п�������
	private static void quickSort(int[] arr, int l, int r) {

		if (l >= r)
			return;

		int p = __partition(arr, l, r);
		quickSort(arr, l, p - 1);
		quickSort(arr, p + 1, r);
	}

	private static int __partition(int[] array, int startIndex, int endIndex) {
//		int e = array[startIndex];
//		int j = startIndex;
//		for(int i = startIndex+1;i<=endIndex;i++){
//			if(array[i] < e){
//				j++;
//				swap(array[j],array[i]);
//			}
//		}
//		swap(array[startIndex],array[j]);
//		return j;
		
		//���ѡ��һ�� ֵ������ΪstartIndex��ֵ�����������ڼ������������Ч����������
		swap(array[startIndex],array[(int)Math.random()%(endIndex-startIndex+1)+startIndex]);
		
		
	        int standard = array[startIndex]; // �����׼
	        int leftIndex = startIndex; // ��ָ��
	        int rightIndex = endIndex; // ��ָ��

	        while(leftIndex < rightIndex) {
	            while(leftIndex < rightIndex && array[rightIndex] >= standard) {
	                rightIndex--;
	            }
	            array[leftIndex] = array[rightIndex];

	            while(leftIndex < rightIndex && array[leftIndex] <= standard) {
	                leftIndex++;
	            }
	            array[rightIndex] = array[leftIndex];
	        }

	        array[leftIndex] = standard;
	        return leftIndex;
	}

	private static void swap(int i, int j) {
		int tmp = i;
		i = j;
		j = tmp;
	}

	public static void main(String[] args) {
		int[] arr = RandomArr.randomArrayFactory(10, 2, 90);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		QuickSort.sort(arr, 10);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
