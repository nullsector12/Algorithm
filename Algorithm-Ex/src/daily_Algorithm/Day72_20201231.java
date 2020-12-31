package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 31 Daily Algorithm 
 *  Day72 - Programmers Cording Test Level 1
 *  x만큼 간격이 있는 n개의 숫자
 * 
 */

public class Day72_20201231 {
	
    public static long[] solution(int x, int n) {
		
    	long[] answer = new long[n];
    	long element = 0;
    	
    	for(int i=0; i<n; i++) {
    		element = element + (long)x;
    		answer[i] = element;	
    	}
    	
    	for(long result:answer) {
    		System.out.print(result+" ");
    	}

		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int x = -10000000;
		int n = 1000;
		
		
		System.out.println(solution(x, n));
		
	}
}
