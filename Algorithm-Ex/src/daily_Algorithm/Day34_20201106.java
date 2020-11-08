package daily_Algorithm;

/*
 *  2020. 11. 06 Daily Algorithm 
 *  Day34 - baekjoon 단계별 문제풀이 문제번호 2231
 * 	분해합
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day34_20201106 {
		
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result =0; // 결과 기본값 0
		
		// N= 555 일 경우, i는 1부터 555까지 반복함
		for(int i=1; i<N; i++){
			int num = i; // 1부터 555까지의 숫자
			int sumNum = i; // 분해합 
			
			// i = 543일 때
			while(num != 0) {
				sumNum += num%10;
				// 543 + 543%10(= 3) -> 543 + 543%10(= 3) + 54%10(= 4) + 543 +...+ 5%10(= 5)
				
				num = num/10; 
				// num = 543/10(= 54) -> 54/10(= 5)
			}	
			if(sumNum == N) { //543 + 3 + 4 + 5 = 555
				result = i; // result = i(543)
				break;
			}
		}
		System.out.println(result);
	}
}