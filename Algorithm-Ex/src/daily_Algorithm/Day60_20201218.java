package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 16 Daily Algorithm 
 *  Day59 - Programmers Cording Test Level 1
 *  이상한 문자 만들기
 * 
 */

public class Day60_20201218 {
	
	public static int solution(int n)  {
		int answer = 0;

		int slice = 0;
		
		while(n>0) {
		
			slice = n%10;
			n = n/10;
			answer += slice;
			
		}
		
		
		return answer;
	}	
	
	public static void main(String[] args) throws Exception{
		
		int n = 987;
		
		System.out.println(solution(n));
		
	}
}
