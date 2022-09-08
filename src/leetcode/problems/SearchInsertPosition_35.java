package leetcode.problems;

public class SearchInsertPosition_35 {
	// Input: nums = [1,3,5,6], target = 2	Output: 1
	// Input: nums = [1,3,5,6], target = 5	Output: 2
	// binary search
	public int searchInsert(int[] nums, int target) {
		
		int l = 0, r = nums.length-1;
		
		while (l <= r) {
			int mid = (l+r)/2;
			
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return l;
		
    }
	
	public static void main(String[] args) {
		SearchInsertPosition_35 searchInsertPosition_35 = new SearchInsertPosition_35();
		int[] x = {1,2,3,5};
		
		System.out.println(searchInsertPosition_35.searchInsert(x, 0));
		
	}
}
