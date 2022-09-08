package leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays_349 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        
		Set set = new HashSet();
		
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					set.add(nums1[i]);
				}
			}
		}
		int[] result = new int[set.size()];

		int i = 0;
		for (Object items : set) {
			result[i++] = (int) items;
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		IntersectionofTwoArrays_349 intersectionofTwoArrays_349 = new IntersectionofTwoArrays_349();
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {23,2,3,4};
		System.out.println(Arrays.toString(intersectionofTwoArrays_349.intersection(nums1, nums2)));
	}
}
