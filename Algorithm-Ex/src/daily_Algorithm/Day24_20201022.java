package daily_Algorithm;

/*
 *  2020. 10. 20 Daily Algorithm 
 *  Day22 - baekjoon 단계별 문제풀이 문제번호 11654, 11720
 * 	아스키 코드, 숫자의 합
 * 
 */

import java.io.*;
import java.util.*;
public class Day24_20201022 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int R = 0;
		String S = "";
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			for(int j=0; j<S.length(); j++) {
				for(int a=0; a<R; a++) {
					bw.write(S.charAt(j));
				}
				
			}
			bw.write("\n");
		}
		
		bw.flush();

	}
}