package daily_Algorithm;

/*
 *  2020. 10. 18 Daily Algorithm 
 *  Day20 - baekjoon 단계별 문제풀이 문제번호 1065
 * 	한수
 * 
 * 한수란? 정수 a의 각 자리가 등차수열을 이루는 수
 * ex. a = 567, 5-6 = -1 / 6-7 = -1로 등차수열을 이뤄 a=567은 한수이다.
 * but a = 680, 6-8 =-2 / 8-0 = 8로 등차수열을 이루지 못해 a=680은 한수가 아니다.
 * also 1~9 처럼 그 수 자체가 수열을 이루거나 10~99 처럼 한개의 수열로 등차수열을 이루는 수들은 한수로 본다.
 * 따라서 1~99까지는 한수에 무조건 포함된다.
 * 
 */

import java.io.*;
public class Day20_20201018 {

	// 수열을 계산해 줄 함수 생성
	public static int hanNumber(int N) {
		// 결과를 return해줄 변수 생성
		int result = 0;  
		
		// 1. 입력받은 N의 값이 1~99 사이면 result = N이 됨
		if(N<100) {
			return N;
		} else {
			
			// 만약 N이 99보다 크다면 result를 99로 초기화
			result = 99;
			
			// 또한 문제에서 주어진 입력값은 1000까지인데 1000은 어차피 한수가 아니다
			// 따라서 1000이 입력되면 N을 999로 바꾸고 세자리로 통일하여 처리할 수 있게 한다.
			if(N == 1000) {
				N = 999;
			}
			
			for(int i=100; i<=N; i++) {
				
				// 100의 자리, 10의 자리, 1의 자리 수의 변수를 각각 초기화
				int thirdNum = i/100; // 100의 자리 수
				int secondNum = (i/10)%10; // 10의 자리 수
				int firstNum = i%10; // 1의 자리 수
				
				// 100의 자리 수 - 10의 자리 수 == 10의 자리 수 - 1의 자리 수
				if((thirdNum - secondNum) == (secondNum - firstNum)) {
					result++;
				}
			}
			
			return result;
			
		}

	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값 N
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(hanNumber(N));
		
		
	}
	
}