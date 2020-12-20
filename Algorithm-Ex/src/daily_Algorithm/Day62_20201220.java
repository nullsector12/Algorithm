package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 20 Daily Algorithm 
 *  Day62 - Programmers Cording Test Level 1
 *  정수 내림차순으로 배치하기
 * 
 */

public class Day62_20201220 {
	
    public static long solution(long n) {
		long answer = 0;
		
		ArrayList<Long> backword = new ArrayList<Long>();
		
		while(n>0) {
			backword.add(n%10);
			n = n/10;
		}
		
		Collections.sort(backword);
		Collections.reverse(backword);
		
		for(int i=0; i<backword.size(); i++) {
			
			answer = answer*10 + backword.get(i);
			
		}
		return answer;
	}	
	
	
	public static void main(String[] args) throws Exception{
		
		long n = 12345;
		
		System.out.println(solution(n));
		
	}
}
