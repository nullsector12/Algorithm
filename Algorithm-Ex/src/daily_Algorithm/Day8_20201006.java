package daily_Algorithm;


/*
 *  2020. 10. 05 Daily Algorithm 
 *  Day7 - baekjoon 단계별 문제풀이 문제번호 10952번, 10951번, 1110번
 * 	A+B - 5 / A+B - 4 / 더하기 사이클
 * 
 * 	EOF?
 * 	End Of File (파일의 끝)
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
		int arr[]= new int[N];
		int max = 0;
		int min = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		bw.write(arr[0]+" "+arr[N-1]);
		bw.flush();

	}

}
