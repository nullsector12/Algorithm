package daily_Algorithm;

/*
 *  2020. 10. 30 Daily Algorithm 
 *  Day32 - baekjoon 단계별 문제풀이 문제번호 10872
 * 	팩토리얼
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day32_20201030 {
	
	public static int factorial(int N) {
		
		if(N <= 1) {
			return 1;
		}
		return N*factorial(N-1);
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));

	}
}