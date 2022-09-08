package leetcode.problems;

public class AddBinary_67 {
	// 宣告StringBuilder用append方式加入, 最後再reverse轉成String return
	public static String addBinary(String a, String b) {
        int al = a.length()-1;
        int bl = b.length()-1;
        int cl= 0;
        StringBuilder sb = new StringBuilder();
        
        while(al >=0 || bl >=0) {
        	int sum = cl;
        	if (al >=0) {
        		sum += a.charAt(al--) - '0'; // 有待考察, 沒有加上(-'0')的話, 會跑出char的ASCII 代號
        	}
        	if(bl >= 0) {
        		sum += b.charAt(bl--) - '0';
        	}
        	sb.append(sum %2);  
        	cl = sum/2; // 將進位帶給下個sum
        }
        
        if(cl != 0) { // 如果到最後cl還有1, 要加上
        	sb.append(cl);
        }
        
        String result = sb.reverse().toString();
		return result;
    }
	
	public static void main(String[] args) {
		String a = "101";
		String b = "11";
		System.out.println(addBinary(a, b));
	}
}
