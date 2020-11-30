package daily_Algorithm;


import java.util.*;

/*
 *  2020. 11. 30 Daily Algorithm 
 *  Day50 - Programmers Cording Test Level 1
 *  문자열 다루기 기본
 * 
 */

public class Day51_20201130 {
	
	public static boolean solution(String s)  {
		
		boolean answer = true;
		
		if(s.length() < 4 || s.length() == 5 || s.length() > 6) {
			answer = false;
			return answer;
		}
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			if(s.charAt(i) > 58) {
				answer = false;
				return answer;
			}
		}
		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		String s = "1234567";
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
