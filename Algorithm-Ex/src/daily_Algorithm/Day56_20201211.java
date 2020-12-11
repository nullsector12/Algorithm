package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 11 Daily Algorithm 
 *  Day56 - Programmers Cording Test Level 1
 *  3진법 뒤집기
 * 
 */

public class Day56_20201211 {
	
	public static int solution(int n)  {
		// 3진법으로 변환한 수를 저장할 ArrayList
		ArrayList<String> ans = new ArrayList<String>();
		// 변환한 3진법 수를 뒤집어 저장할 문자열
		String reverse = "";
		
		// 3진법으로 변환할 반복문
		while(n>0) {
			// 3진법으로 변환한 수 List에 저장
			ans.add(String.valueOf(n%3));
			// 다음 3진법 구하기
			n /= 3;
		}
		
		// 3진법으로 변환한 수를 뒤집어 저장
		for(int i=0; i<ans.size(); i++) {
			reverse += ans.get(i);
		}
		
		// 뒤집은 3진법 수를 다시 10진법으로 변환
		return Integer.parseInt(reverse, 3);
		}


	public static void main(String[] args) throws Exception{
		int n = 45;
		
		System.out.println("결과 : "+ solution(n));
		
	}
}
