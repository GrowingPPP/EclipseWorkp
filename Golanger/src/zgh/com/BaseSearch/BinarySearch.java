package zgh.com.BaseSearch;

public class BinarySearch {
	// ���ֲ��ҷ�������������arr�У�����target
	// ����ҵ�����������
	// û���ҵ�,����-1��
	public static int search(int[] arr, int n, int target) {
		int l = 0;
		int r = n - 1;
		while (l <= n) {
			// int mid = (l+r)/2;//��ֹ���
			int mid = l + (r - l) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				l = mid + 1;
			}
			if (arr[mid] > target) {
				r = mid - 1;
			}
		}
		return -1;
	}
}
