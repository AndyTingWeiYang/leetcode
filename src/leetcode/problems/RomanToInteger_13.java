package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
	
	public static int romanToInt(String s) {
		
		int result = 0;
		
		Map <String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		for (int i = 0; i < s.length(); i++) {
			
			String roman = s.charAt(i) + "";
			
			int value = 0;
			
			if(map.containsKey(roman)) {
				map.get(roman);
				if(i != 0 && map.get(s.charAt(i-1) + "") < map.get(roman)) {
					value += (map.get(roman) - map.get(s.charAt(i-1) + "") - map.get(s.charAt(i-1) + ""));
					result += value;
				} else {
					value += map.get(roman);
					result += value;
				}
			}
		}
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		String s = "LVIII";
		
		System.out.println(romanToInt(s));
		
	}
	
	
}
