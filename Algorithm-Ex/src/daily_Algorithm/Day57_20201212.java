package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 12 Daily Algorithm 
 *  Day57 - Programmers Cording Test Level 1
 *  시저 암호
 * 
 */

public class Day57_20201212 {
	
	public static String solution(String s,int n)  {
		String answer = "";
		int cipher = 0;
		
		for(int i=0; i<s.length(); i++) {
			char slash = s.charAt(i);
//			System.out.println(slash);
			
			// 공백일 경우
			if(slash == ' ') {
				answer += slash;
				continue;
			}
			
			// z 혹은 Z일 경우
			if(slash == 'z') {
				slash = 'z'-26;
				cipher = slash+n;
				answer += (char) cipher;
				continue;
			} else if(slash == 'Z') {
				slash = 'Z'-26;
				cipher = slash+n;
				answer += (char) cipher;
				continue;
			}
			
			cipher = slash+n;
//			System.out.println(cipher);
			
			// n만큼 밀어낸 글자가 z 혹은 Z를 넘어갈 경우
			if((slash > 65 && slash < 90) && cipher > 90) {
//				cipher = 'A' + (cipher-'Z') - 1;
				cipher = 'A' + (cipher-'[');
			}else if((slash > 97 && slash < 122) && cipher > 122) {
//				cipher = 'a' + (cipher -'z') - 1;
				cipher = 'a' + (cipher -'{');
			}
			answer += (char) cipher;
		}
		
		return answer;
		}

	// 오답
//		String answer = "";
//		
//		for(int i=0; i<s.length(); i++) {
//			char slash = s.charAt(i);
//			
//			if(slash == ' ') {
//				answer += slash;
//				continue;
//			}
//			
//			if(slash == 'z') {
//				slash = 'z'-26;
//			} else if(slash == 'Z') {
//				slash = 'Z'-26;
//			}
//			
//			char cipher = (char)(slash+n);
//			answer += cipher;
//		}
//		
//		return answer;
//		}
		
	
	
	public static void main(String[] args) throws Exception{
		String s = "Z a H k B z";
		int n = 25;
		
		System.out.println("결과 : "+ solution(s, n));
		
	}
}
