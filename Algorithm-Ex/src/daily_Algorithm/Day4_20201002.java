package daily_Algorithm;

import java.io.*;
import java.util.*;

/*
 *  2020. 10. 02 Daily Algorithm 
 *  Day4 - baekjoon 단계별 문제풀이 문제번호 2741번 2742번 11021번 11022번
 * 	N 찍기 / 기찍 N / A+B - 7 / A+B - 8
 * 
 * 
 */


public class Day4_20201002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
//		int N = Integer.parseInt(br.readLine());
		
		
//		N 찍기
		
//		for(int i = 1; i<=N; i++) {
//			bw.write(i+"\n");
//		}
//		bw.flush();

		
//		기찍 N
		
//		for(int i=N; i>0; i--) {
//			bw.write(i+"\n");
//		}
//		bw.flush();
		
		
//		A+B - 7		
		
		int T = Integer.parseInt(br.readLine());
		
//		for(int i=1; i<=T; i++) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			int result = A+B;
//			
//			bw.write("Case #"+i+": "+result+"\n");
//		}
//		
//		bw.flush();
		
		
//		A+B - 8
		
		for(int i=1; i<=T; i++) {		
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int result = A+B;
			
			bw.write("Case #"+i+": "+A+" + "+B+" = "+result+"\n");
			
		}
		bw.flush();
	}
	
}
