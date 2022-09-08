package leetcode.problems;

public class MaximumSubarray_53 {
	// 此題思路: DP
	// 宣告一個副陣列, 來存放目前遇到的最大值, 最後取副陣列內最大值為解
	// 如果前一個陣列元素(目前總和)<0且現在元素為正, 則捨棄前面的元素加總, 從正的元素開始
	public static int maxSubArray(int[] nums) {
        int dp [] = new int [nums.length]; //宣告副陣列來存放目前最大和
        dp[0] = nums [0]; // 指定nums[0]給dp[0]
        int max = dp[0]; // 目前最大值
        
        for (int i = 1; i < nums.length; i++) {
        	dp[i] = nums[i] + (dp[i-1] > 0? dp[i-1] : 0); // 如果前一個陣列元素(目前總和)<0且現在元素為正, 則捨棄前面的元素加總, 從正的元素開始
        	max = Math.max(max, dp[i]); // 更新最大值
        }
        return max; // 回傳max
    }
	
	public static void main(String[] args) {
		int array [] = {5,4,-1,7,8};
		System.out.println(maxSubArray(array));
	}
}
