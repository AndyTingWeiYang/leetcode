package leetcode.problems;

import java.util.Arrays;

public class PlusOne_66 {
	// digits = [4,9,9,9,9]
	public static int[] plusOne(int[] digits) {
		 int n = digits.length;
		 
		 // 從最後一個元素開始看, 如果是9, 就=0, 9以外的就++
		 // 其實不用管進位問題, 因為前面就算是9也是0, 直到不是9
		 for(int i = n-1; i >=0; i--) {
			 if(digits[i] == 9) {
				 digits[i] = 0;
			 } else {
				 digits[i]++;
				 return digits;
			 }
		 }
		 // 這邊是避免有進位的狀況, 只要會進位, 就代表第一個元素是1而其他都是0, 所以只要指定第一個元素是1返回原Array即可
		 int nineNine [] = new int[n+1];
		 nineNine[0] = 1;
		 return nineNine;
		
		// 以下為醜陋的錯誤示範, 用取數值再加1, 若Array是超過int(long)的長度, 就爆了
/*		int l = digits.length;
		int num = 0;

		for(int i = 0; i < l; i++) {
			num += (digits[i] * Math.pow(10, l-i-1));
		}
		
		num += 1;
		String s = Integer.toString(num);
		
		int plus [] = new int[s.length()];
		for(int j = 0; j < l; j++) {
			plus[j] = Integer.parseInt(String.valueOf(s.charAt(j))); 
		}
		return plus;
*/
		
    }
	
	public static void main(String[] args) {
		int array[] = {4,9,9,9};
		System.out.println(Arrays.toString(plusOne(array)));
		
		
	}
}
