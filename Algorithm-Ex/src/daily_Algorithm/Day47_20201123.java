package daily_Algorithm;


import java.util.*;



/*
 *  2020. 11. 23 Daily Algorithm 
 *  Day47 - Programmers Cording Test Level 1
 * 	두 정수 사이의 합
 * 
 */

public class Day47_20201123 {
	
	public static long solution(int a, int b)  {
		long answer = 0;
		// a=b일 경우
		if(a == b) {
			return a;
		}else if(a>b) {
			answer = a;
			for(; b<a; b++) {
				answer = answer+b;
			}
			
		}else {
			answer = b;
			for(; a<b; a++) {
				answer = answer+a;
			}
		}
		
		return answer; 
		}


	public static void main(String[] args) throws Exception{
		int a = -100000;
		int b = 100;
		
		System.out.println("결과 : "+solution(a, b));
		
	}
}
