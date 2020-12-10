package daily_Algorithm;


import java.util.*;

/*
 *  2020. 12. 10 Daily Algorithm 
 *  Day55 - Programmers Cording Test Level 1
 *  문자열을 정수로 바꾸기
 * 
 */

public class Day55_20201210 {
	
	public static int solution(String s)  {
		
		int answer = 0;
		boolean plusMinus = true;
		
		// Integer.parseInt() 함수 사용
//		answer = Integer.parseInt(s);

		
		// 함수 미사용
		// 첫 번째 글자에 +나 -부호가 올 수 있다.
		// 따라서 첫 글자가 -일 경우에만 false로 바꿔줌
		if(s.charAt(0) == '-') {
			plusMinus = false;
		}
		
		// 문자열 맨 앞자리 부호는 들어갈 수도 있고 들어가지 않을 수도 있다고 명시됨
		// 따라서 인덱스 0번째부터 시작하고
		for(int i=0; i<s.length(); i++) {
			char num = s.charAt(i);
			// 만약 0번째 문자열이 -나 +라면 
			// for문을 다시 반복함
			if(num == '-' || num == '+') {
				continue;
			}
			// 아니라면 char를 int로 변환하여 계산
			// 숫자 맨 앞에 0이 나오지 않을거라는 조건이 있어 쉽게 해결
			answer = answer * 10 +(num - '0');
		}
		
		// 만약 plusMinus 판별이 false로 바뀌었다면
		if(!plusMinus) {
			// 변환한 정수에 -1을 곱한 후 결과 출력
			answer = -1*answer;
		}
		
		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		String s = "-23";
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
