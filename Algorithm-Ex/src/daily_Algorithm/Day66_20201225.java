package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 25 Daily Algorithm 
 *  Day66 - Programmers Cording Test Level 1
 *  최대공약수와 최소공배수
 * 
 */

public class Day66_20201225 {
	
    public static int[] solution(int n, int m) {
		
    	int[] answer = new int[2];
    	// 유클리드 호제법을 이용해 연산한 n과 m의 결과를 담을 변수
    	int cal_N = n;
    	int cal_M = m;
    	
    	// n이 m보다 작은 수가 입력됐을 경우
    	if(n < m) {
    		// cal_N이 0보다 큰 동안 반복
    		while(cal_N > 0) {
    			// 연산 이전 N값을 저장할 변수
    			int pre_N = cal_N;
    			// cal_N = cal_M % cal_N이 되고,
    			cal_N = cal_M%cal_N;
    			// cal_M = 연산 이전 N값이 된다.
    			cal_M = pre_N;
    		}
    		answer[0] = cal_M;
    		answer[1] = cal_M *(n/cal_M) *(m/cal_M);
    		
    	// m이 n보다 작은 수가 입력됐을 경우
    	// 위 연산에서 n과 m 자리만 바꿔주면 된다.
    	} else {
    		while(cal_M >0) {
    			int pre_M = cal_M;
    			cal_M = cal_N%cal_M;
    			cal_N = pre_M;
    		}
    		answer[0] = cal_N;
    		answer[1] = cal_N *(n/cal_N) *(m/cal_N);
    	}

		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int n = 12;
		int m = 3;
		
		System.out.println(solution(n, m));
		
	}
}
