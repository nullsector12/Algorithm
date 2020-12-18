package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 19 Daily Algorithm 
 *  Day61 - Programmers Cording Test Level 1
 *  자연수 뒤집어 배열로 만들기
 * 
 */

public class Day61_20201219 {
	
	public static ArrayList<Integer> solution(long n)  {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		while(n>0) {
			answer.add((int) (n%10));
			n = n/10;
		}
		
		return answer;
	}	
	
	
	public static void main(String[] args) throws Exception{
		
		long n = 12345;
		
		System.out.println(solution(n));
		
	}
}
