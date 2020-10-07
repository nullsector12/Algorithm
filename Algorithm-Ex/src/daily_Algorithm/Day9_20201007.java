package daily_Algorithm;

/*
 *  2020. 10. 07 Daily Algorithm 
 *  Day9 - baekjoon 단계별 문제풀이 문제번호 2562
 * 	최댓값
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day9_20201007 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int max = -100;
		int[] arr = new int[9];
		int count = 0;
//		st = new StringTokenizer(br.readLine());
		for(int i=0; i<9; i++) {
//			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			if(arr[i] > max) {
				max = num;
				count = i+1;
				
			}
			
		}
		bw.write(max+"\n"+count);
		bw.flush();

	}

}
