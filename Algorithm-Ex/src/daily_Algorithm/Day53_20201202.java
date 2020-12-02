package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 02 Daily Algorithm 
 *  Day53 - Programmers Cording Test Level 1
 *  소수 찾기
 * 
 */

public class Day53_20201202 {
	
	public static int solution(int n)  {
		
		int answer = 0;
		boolean[] prime= new boolean[n+1];
		prime[0] = prime[1] = true;
		
		for(int i=2; i*i<=n; i++) {			
			for(int j=i*i; j<=n; j+=i) {
				prime[j] = true;
			}
		}
		
		for(int i=0; i<=n; i++) {
			if(prime[i] == false) {
				answer +=1;
			}
		}
		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		int n = 60;
		
		System.out.println("결과 : "+ solution(n));
		
	}
}
