package daily_Algorithm;

import java.io.*;
import java.util.*;

/*
 *  2020. 10. 03 Daily Algorithm 
 *  Day5 - baekjoon 단계별 문제풀이 문제번호 2438번 2439번 
 * 	별 찍기 - 1 / 별 찍기 - 2 
 * 
 * 
 */

public class Day5_20201003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
//		for(int i=1; i <=N; i++) {
//			for(int j=1; j <=i; j++) {
//				bw.write("*");
//				
//			}
//			bw.newLine();
//		}
//		bw.flush();
//		bw.close();
		
		
		for(int i=1; i<=N; i++) {
			for(int g=1; g <=N-i; g++) {
				bw.write(" ");
			}
			for(int j=1; j<=i; j++) {
				bw.write("*");	
				
			}
			bw.newLine();
		}
		bw.flush();
	
	}

}
