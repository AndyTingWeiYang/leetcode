package leetcode.problems;

public class MergeSortedArray_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// nums1 = {1,2,3,0,0,0};
		// m = 3;
		// nums2 = {2,5,6};
		// n = 3;
		// output nums1 = {1,2,2,3,5,6}
		
		// 思路: 從nums1後方開始加入, 如果nums2數字比nums1大, 則擺在後面
		int b1 = m-1;
		int b2 = n-1;
		int finish = m+n-1;
		
		while(b1 >=0 && b2 >=0) {
			nums1[finish--] = (nums1[b1] > nums2[b2]) ? nums1[b1--] : nums2[b2--];
		}
		
		while(b2 >=0) {
			nums1[finish--] = nums2[b2--];
		}
    }
}
