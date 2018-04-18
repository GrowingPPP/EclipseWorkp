package zgh.com.BaseSearch;

public class BinarySearch {
	// 二分查找发，在有序数组arr中，查找target
	// 如果找到，返回索引
	// 没有找到,返回-1；
	public static int search(int[] arr, int n, int target) {
		int l = 0;
		int r = n - 1;
		while (l <= n) {
			// int mid = (l+r)/2;//防止溢出
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
