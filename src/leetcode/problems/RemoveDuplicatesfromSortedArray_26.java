package leetcode.problems;

import java.util.*;

public class RemoveDuplicatesfromSortedArray_26 {
	// Solution1
	// 思路: 使用two pointers 透過i & j去比對元素是否重複, 若重複, j++直到j走訪到不重複的元素 則i++
	public static int removeDuplicates(int[] nums) {
        int i = 0; // slow index
        int j = 0; // fast index
        while (j < nums.length) {  // fast index must be smaller than nums.length
        	nums[i] = nums[j]; // assign num[j] to num[i]
        	while (j < nums.length && nums[j] == nums[i]) { 
        		j++; // when nums[j] == nums[i], j++ until j find non-duplicated element
        	}
        	i++; // back to first while and reassign nums[j] to nums[i]
        }
        return i; // after traverse all elements, return i
    }
	
	// Solution2
	// 思路: Set不重特性, 將nums陣列加入LinkedHashSet (HashSet不行, 因為沒有確保元素相對位置), 再將LinkedHashSet index取出
	public static int removeDuplicates2(int[] nums) {
		Set <Integer> s = new LinkedHashSet<>();
		for (int x : nums) {
			s.add(x); // 將nums陣列內的元素用int型別, 透過變數x加入LinkedHashSet
		}
		int index = 0; 
		for (int x : s) {
			nums[index++] = x; // 遍歷s內所有元素取得index值
		}
		return index; // return index
    }
	
	public static void main(String[] args) {
		int [] x = {1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(x));
	}
	
}

