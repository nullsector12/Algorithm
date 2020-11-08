package daily_Algorithm;

/*
 *  2020. 10. 29 Daily Algorithm 
 *  Day31 - baekjoon 단계별 문제풀이 문제번호 2839
 * 	설탕 배달
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day28_20201029 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int remainder = N%5;
		int quotient = N/5;
		if(N== 4 || N == 7) {
			System.out.println(-1);
		} else if(remainder == 1 || remainder == 3) {
			System.out.println(quotient+1);
		} else if(remainder == 0) {
			System.out.println(quotient);
		} else if((remainder)%2 == 0) {
			System.out.println(quotient+2);
		} 
	}
}