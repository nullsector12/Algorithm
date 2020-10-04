package daily_Algorithm;

import java.io.*;
import java.util.*;

/*
 *  2020. 10. 04 Daily Algorithm 
 *  Day3 - baekjoon 단계별 문제풀이 문제번호 10871번 
 * 	x보다 작은 수 
 * 
 * 
 */

public class Day6_20201004 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int A[] = new int[N];
		StringTokenizer num = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(num.nextToken());
			
			if(A[i]< X) {
				bw.write(A[i]+" ");
			}
			
		}
		bw.flush();
		
	}

}