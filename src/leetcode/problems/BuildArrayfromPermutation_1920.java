package leetcode.problems;

import java.util.Arrays;

public class BuildArrayfromPermutation_1920 {
	
	public static int[] buildArray(int[] nums) {
		int ans [] = new int[nums.length]; // ans長度與傳入的nums相同
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]]; // 取值
		}
		return ans;
    }
	
	public static void main(String[] args) {
		int array []= {0,3,5,6,1,2,4};
		System.out.println(Arrays.toString(buildArray(array)));
	}
}

