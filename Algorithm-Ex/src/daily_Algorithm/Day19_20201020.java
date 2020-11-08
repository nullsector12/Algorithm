package daily_Algorithm;

/*
 *  2020. 10. 20 Daily Algorithm 
 *  Day22 - baekjoon 단계별 문제풀이 문제번호 11654, 11720
 * 	아스키 코드, 숫자의 합
 * 
 */

import java.io.*;
import java.util.*;
public class Day19_20201020 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 아스키 코드
//		char ascii = br.readLine().charAt(0);
//		int num = (int)ascii;
//		System.out.println(num);
		
		// 숫자의 합
		
		int N = Integer.parseInt(br.readLine());
		byte[] input = br.readLine().getBytes();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += input[i] -'0';
		}
		System.out.println(sum);

	}
}