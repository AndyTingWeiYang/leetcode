package leetcode.problems;

public class RemoveElement_27 {
	public static int removeElement(int[] nums, int val) {
		// array = [0,1,2,2,3,0,4,2], val = 2;
		// 思路: 假設val = 2, 那會return 5, 陣列前五個數字應為原陣列非2的值, 五個數字後面是甚麼就不用管
		int l = 0; 
		for (int i = 0; i < nums.length; i++) {
			if (val != nums[i]) {
				nums[l] = nums[i]; 
				l++;
			}
		}
		return l;
    }
	
	public static void main(String[] args) {
		int array [] = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(array, val));
	}
}
