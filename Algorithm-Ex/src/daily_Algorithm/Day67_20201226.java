package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 26 Daily Algorithm 
 *  Day67 - Programmers Cording Test Level 1
 *  콜라츠 추측
 * 
 */

public class Day67_20201226 {
	
    public static int solution(int num) {
		
    	int answer = 0;
    	long l_num = num;
    	
    	
    	while(l_num > 1 && answer < 500) {
    		
    		// 삼항 연산자 사용버전
    		l_num = (l_num%2 == 0) ? l_num/2 : l_num*3+1;
    		answer += 1;
    		// 일반 if식
//    		if(l_num%2 == 0) {
//    			l_num = l_num/2;
//    			answer += 1;
//    			System.out.println("짝수인 경우 : " + l_num);
//    		}else if(l_num%2 != 0) {
//    			l_num = (l_num*3)+1;
//    			answer +=1;
//    			System.out.println("홀수인 경우 : "+l_num);
//    		}
    		
    		if(answer == 500) {
    			return -1;
    		}
    	}
    	
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int num = 626331;
		
		
		System.out.println(solution(num));
		
	}
}
