package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 01 Daily Algorithm 
 *  Day52 - Programmers Cording Test Level 1
 *  서울에서 김서방 찾기
 * 
 */

public class Day52_20201201 {
	
	public static String solution(String[] seoul)  {
		
		String answer = "";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 " + i +"에 있다";
			}
		}

		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		String[] seoul = {"Jane", "Kim"};
		
		System.out.println("결과 : "+ solution(seoul));
		
	}
}
