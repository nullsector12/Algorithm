package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 16 Daily Algorithm 
 *  Day59 - Programmers Cording Test Level 1
 *  이상한 문자 만들기
 * 
 */

public class Day59_20201216_ver2 {
	
	public static String solution(String s)  {
		String answer = "";
		StringTokenizer st = new StringTokenizer(s);
		
		for(int i=0; i<s.length(); i++) {
			if(String.valueOf(s.charAt(i)).equals(" ")) {
				answer += " ";
			}else if(st.hasMoreTokens()){
				String elements = st.nextToken();
				for(int j=0; j<elements.length(); j++) {
					if(j%2 == 0) {
						answer += String.valueOf(elements.charAt(j)).toUpperCase();
					}else if(j%2 == 1) {
						answer += String.valueOf(elements.charAt(j)).toLowerCase();
					}
				}
				answer += " ";
			}
		}

		return answer;
	}	
	
	public static void main(String[] args) throws Exception{
		
		String s = " No, your Not";
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
