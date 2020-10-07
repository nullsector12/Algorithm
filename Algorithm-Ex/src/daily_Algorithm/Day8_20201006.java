package daily_Algorithm;


/*
 *  2020. 10. 06 Daily Algorithm 
 *  Day8 - baekjoon 단계별 문제풀이 문제번호 10818
 * 	최소, 최대
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day8_20201006 {

	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; 
		
		
		st = new StringTokenizer(br.readLine());
//		for(int i=0; i<N; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			arr[i] = num;
//		}
//		 
//		Arrays.sort(arr);
//		bw.write(arr[0]+" "+arr[N-1]);
//		bw.flush();

		int max = -1000000;
		int min = 1000000;
		
//		for(int i=0; i<N; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			if(num > max) {
//				max = num;
//			}
//			if (num < min) {
//				min = num;
//			}
//		}
//		bw.write(min+" "+max);
//		bw.flush();
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<arr.length; j++) {
				int chk = arr[j];
				if(arr[i]<chk) {
					arr[j] = arr[i];
					arr[i] = chk;
				}
			}
		}
			bw.write(arr[0]+" "+arr[N-1]);
			bw.flush();
			System.out.println(Arrays.toString(arr));
		}
	}

