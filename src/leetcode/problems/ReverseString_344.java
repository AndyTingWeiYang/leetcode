package leetcode.problems;

public class ReverseString_344 {
	//Input: s = ["h","e","l","l","o"]
	//   Output: ["o","l","l","e","h"]
	// Two Pointers!!!
	public static void reverseString(char[] s) {
        
		int i = 0;
		int j = s.length-1;
		
		while(i <= j) {
			
			char temp = s[j];
			s[j] = s[i];
			j--;
			s[i] = temp;
			i++;
		}
		
//		System.out.println(s);
    }
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}
}
