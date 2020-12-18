package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 16 Daily Algorithm 
 *  Day59 - Programmers Cording Test Level 1
 *  이상한 문자 만들기
 * 
 */

public class Day59_20201216_split {
	
	public static String solution(String s)  {
		String answer = "";
		int index = 0;
		String[] token = s.split("");
		
		for(int i=0; i<token.length; i++) {
			if(token[i].equals(" ")) {
				index=0;
			}else {
				if(index%2 == 0) {
					index++;
					token[i] = token[i].toUpperCase();
				} else {
					index++;
					token[i] = token[i].toLowerCase();
				}
			}
			answer += token[i];
		}
		return answer;
	}	
	
	public static void main(String[] args) throws Exception{
		
		String s = "No, Your Not";
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
