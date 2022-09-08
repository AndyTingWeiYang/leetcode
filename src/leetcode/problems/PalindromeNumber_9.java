package leetcode.problems;

public class PalindromeNumber_9 {
	// solution 1
//	public static boolean isPalindrome(int x) {
//		boolean result = false;
//        String s = Integer.toString(x);
//        
//        for (int i = 0; i < s.length(); i++) {
//        	if ((s.charAt(i) + "").equals(s.charAt(s.length()-1-i) + "")) {
//        		result = true;
//        	}else {
//        		result = false;
//        		break;
//        	}
//        }
//        return result;
//    }
	
	// solution 2
	public static boolean isPalindrome(int x) {
		boolean result = false;
        
        if (x >= 0) {
        	String s = Integer.toString(x);
        	StringBuilder sb = new StringBuilder(s);
        	String sr = sb.reverse().toString();
	        if(s.equals(sr)) {
	        	result = true;
	        }
        }
        return result;
        
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
//		String s = "1232";
//		StringBuilder sb = new StringBuilder("1232");
//		System.out.println(s.equals(sb));
	}
}
