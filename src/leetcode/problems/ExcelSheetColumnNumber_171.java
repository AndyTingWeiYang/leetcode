package leetcode.problems;

public class ExcelSheetColumnNumber_171 {
	// ZY = 701 = (26*26) + 25
	public int titleToNumber(String columnTitle) {
       
		int l = columnTitle.length();
        int sum = 0;
        
        for(int i = 0; i < l; i++) {
        	sum *= 26;
        	sum += columnTitle.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}
