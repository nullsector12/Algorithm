package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 29 Daily Algorithm 
 *  Day70 - Programmers Cording Test Level 1
 *  핸드폰 번호 가리기
 * 
 */

public class Day70_20201229 {
	
    public static String solution(String phone_number) {
		
    	String answer = "";
    	
    	for(int i=0, j=phone_number.length(); i<j; i++) {
    		if((j-i) <= 4) {
    			answer += String.valueOf(phone_number.charAt(i)); 
    			continue;
    		}else {
    			answer += "*";
    		}
    	}
    
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		String phone_number = "4444";
		
		
		System.out.println(solution(phone_number));
		
	}
}
