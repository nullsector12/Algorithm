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
		// a가 b보다 큰 경우 
		}else if(a>b) {
			// answer를 a로 변경
			answer = a;
			// for문을 통해 b+1씩 
			for(; b<a; b++) {
				answer = answer+b;
			}
		// b가 a보다 큰 경우	
		}else {
			// a가 큰 경우와 동일(a와 b 자리만 변경)
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
