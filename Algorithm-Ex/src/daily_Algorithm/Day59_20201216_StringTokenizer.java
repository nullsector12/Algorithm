package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 16 Daily Algorithm 
 *  Day59 - Programmers Cording Test Level 1
 *  이상한 문자 만들기
 * 
 */

public class Day59_20201216_StringTokenizer {
	
	public static String solution(String s)  {
		String answer = "";
		StringTokenizer st = new StringTokenizer(s);
		
		if(String.valueOf(s.charAt(0)).equals(" ")) {
			answer += " ";
		}
		
		while(st.hasMoreTokens()) {
			String element = st.nextToken();
			for(int i=0; i<element.length(); i++) {
				if(i%2 == 0) {
					answer += String.valueOf(element.charAt(i)).toUpperCase();
				} else {
					answer += String.valueOf(element.charAt(i)).toLowerCase();
				}
			}
			
//			for(String test:elements) {
//				answer += test;
//			}
//		
//			elements.removeAll(elements);
//			if(!st.hasMoreTokens()) {
//				break;
//			}
			answer += " ";
		}
		
		
		if(!String.valueOf(s.charAt(s.length()-1)).equals(" ")) {
			answer = answer.substring(0, answer.length()-1);
		}
		
		return answer;
	}	
	
	public static void main(String[] args) throws Exception{
		
		String s = "try hello world";
		
		System.out.println(solution(s));
		
	}
}
