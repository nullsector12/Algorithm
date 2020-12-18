package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 18 Daily Algorithm 
 *  Day60 - Programmers Cording Test Level 1
 *  자릿수 더하기
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
