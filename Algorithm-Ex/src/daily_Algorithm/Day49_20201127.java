package daily_Algorithm;


import java.util.*;

/*
 *  2020. 11. 27 Daily Algorithm 
 *  Day49 - Programmers Cording Test Level 1
 * 	문자열 내 p와 y의 개수
 * 
 */

public class Day49_20201127 {
	
	public static boolean solution(String s)  {
		// answer의 기본값은 flase
		boolean answer = false;
		s = s.toLowerCase();
		// p, P의 갯수 카운트
		int countP = 0;
		// y, Y의 갯수 카운트
		int countY = 0;
		// charAt으로 자른 String값 저장
		char slice = '0';
		
		// 입력된 문자열 s의 길이만큼 반복
		for(int i=0; i<s.length(); i++) {
			// 각 인덱스 마다 문자열 추출
			slice = s.charAt(i);
			// equalsIgnoreCase()를 통해 대소문자 구분 없이 비교
//			if(String.valueOf(slice).equalsIgnoreCase("p")) {
//				countP++;
//			}else if(String.valueOf(slice).equalsIgnoreCase("y")) {
//				countY++;
//			}
			if(slice == 'p') {
				countP++;
			}else if(slice == 'y') {
				countY++;
			}
		}
		
		// 반복문 연산의 결과 countP와 countY의 값이 같다면
		// 이는 P와 Y의 갯수가 0개일 경우도 해당됨
		if(countP == countY) {
			// true를 반환
			answer = true;
		}
		// 갯수가 다르면 그대로 false 반환
		return answer; 
		}


	public static void main(String[] args) throws Exception{
//		String[] strings = {"sun","bed","car"};
		String s = "abcdefg";
		
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
