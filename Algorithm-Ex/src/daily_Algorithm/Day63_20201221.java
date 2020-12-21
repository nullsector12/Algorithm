package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 21 Daily Algorithm 
 *  Day63 - Programmers Cording Test Level 1
 *  정수 제곱근 판별
 * 
 */

public class Day63_20201221 {
	
    public static long solution(long n) {
		long answer = -1;
		Double sqrt = Math.sqrt(n);
		
		if(sqrt == sqrt.longValue()) {
			answer = (long)Math.pow(sqrt+1, 2);
		} 

		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		long n = 12345;
		
		System.out.println(solution(n));
		
	}
}
