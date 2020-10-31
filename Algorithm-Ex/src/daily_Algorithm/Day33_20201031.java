package daily_Algorithm;

/*
 *  2020. 10. 31 Daily Algorithm 
 *  Day32 - baekjoon 단계별 문제풀이 문제번호 10870
 * 	피보나치 수5
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day33_20201031 {
	
	public static int fibonacci(int N) {
		
		if(N >= 2) {
			N = fibonacci(N-2) + fibonacci(N-1);
		}
		return N;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(N));

	}
}