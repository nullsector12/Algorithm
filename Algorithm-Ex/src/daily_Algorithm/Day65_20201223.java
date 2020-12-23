package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 23 Daily Algorithm 
 *  Day65 - Programmers Cording Test Level 1
 *  짝수와 홀수
 * 
 */

public class Day65_20201223 {
	
    public static String solution(int num) {
		
    	String answer = "Odd";
		
    	if(num%2 == 0) {
    		answer = "Even";
    	}
    	
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int num = 55555555;
		
		System.out.println(solution(num));
		
	}
}
