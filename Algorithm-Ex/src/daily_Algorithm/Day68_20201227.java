package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 27 Daily Algorithm 
 *  Day68 - Programmers Cording Test Level 1
 *  평균 구하기
 * 
 */

public class Day68_20201227 {
	
    public static double solution(int[] arr) {
		
    	double answer = 0;
    	double sum = 0;
    	
    	for(double element : arr) {
    		sum += element;
    	}
    	
    	answer = sum/arr.length; 
    	System.out.println(answer);
    	
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int[] arr = {5,2,3,4};
		
		
		System.out.println(solution(arr));
		
	}
}
