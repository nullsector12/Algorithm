package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 13 Daily Algorithm 
 *  Day58 - Programmers Cording Test Level 1
 *  약수의 합
 * 
 */

public class Day58_20201213 {
	
	public static int solution(int n)  {
		int answer = 0;
		
		int middle = n;
		
		// n이 0이거나 1이 입력됐을 때,
		if(n == 0) {
			// 0 반환
			return answer;
		}else if(n == 1) {
			// 1 반환
			return n;
		}
		
		// 나머지 정수들이 입력됐을 때,
		for(int i=1; i<n; i++) {
			// 만약 middle값이 i값 보다 작아지거나 같다면
			if(middle <= i) {
				// 결과 반환
				return answer;
			}
			
			// n%i의 나머지가 0이라면
			if(n%i == 0) {
				// middle은 n/i가 되고,
				middle = n/i;
				// middle이 만약 i값과 같아졌다면
				if(middle == i) {
					// 같은 값은 한번만 더하면 되므로 middle값만 answer에 더해주고
					answer += middle;
					// 반복을 종료한다.
					break;
				}else {
					// 같은 값이 아니라면 i와 middle 두 값 모두 더해준다.
					answer += i+middle;
				}
			}
		}
		return answer;
	}	
	
	public static void main(String[] args) throws Exception{
		
		int n = 1;
		
		System.out.println("결과 : "+ solution(n));
		
	}
}
