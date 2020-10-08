package daily_Algorithm;

import java.io.*;
import java.util.*;

/*
 *  2020. 10. 04 Daily Algorithm 
 *  Day6 - baekjoon 단계별 문제풀이 문제번호 10871번 
 * 	x보다 작은 수 
 * 
 * 
 */

public class Day06_20201004 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		// 배열 사용
//		int A[] = new int[N];
		StringTokenizer num = new StringTokenizer(br.readLine());
//		for(int i=0; i<N; i++) {
//			A[i] = Integer.parseInt(num.nextToken());
//			
//			if(A[i]< X) {
//				bw.write(A[i]+" ");
//			}
			
//		}
		
		// 배열 사용 x
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(num.nextToken());
			if(a < X) {
				bw.write(a+" ");
			}
		}
		
		bw.flush();
		
	}

}