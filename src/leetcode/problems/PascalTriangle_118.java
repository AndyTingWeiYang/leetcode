package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> all = new ArrayList<List<Integer>>(); // 二維List, 此集合內會再放List

		if (numRows <= 0) { 
			return all; // 若列數<= 0, 直接return 空集合
		} else {
			for (int i = 0; i < numRows; i++) { // 列數 = numRows
				// 宣告row列, 裡面元素為數字, 會再放進'all'集合
				List<Integer> row = new ArrayList<Integer>();  // 注意: 每次外迴圈重新必須宣告新的 row, 否則全部元素都會加在同個集合內
			    for (int j = 0; j < i+1; j++) {
			    	if (j == 0 ||  j == i) {
			    		row.add(1); // 頭尾都為1
			    	}else {
			    		row.add(all.get(i-1).get(j-1) + all.get(i-1).get(j)); // row集合內除頭尾以外的元素, 都為上列的相加
			    	}
			    }
			    all.add(row); // 將row裝進大集合
			}
			return all;
		}

	}
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}
