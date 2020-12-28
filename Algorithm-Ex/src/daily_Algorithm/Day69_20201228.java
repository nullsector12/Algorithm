package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 28 Daily Algorithm 
 *  Day69 - Programmers Cording Test Level 1
 *  하샤드 수
 * 
 */

public class Day69_20201228 {
	
    public static boolean solution(int x) {
		
    	boolean answer = true;
    	int sum_x = 0;
    	int div_x = x;
    	
    	
    	while (div_x > 0) {
    		sum_x  += div_x%10;
    		div_x = div_x/10;
    	}
    	
    	if(x%sum_x != 0) {
    		answer = false;
    	}
    	
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int x = 1;
		
		
		System.out.println(solution(x));
		
	}
}
