package daily_Algorithm;

/*
 *  2020. 10. 22 Daily Algorithm 
 *  Day24 - baekjoon 단계별 문제풀이 문제번호 2675
 * 	문자열 반복
 * 
 */

import java.io.*;
import java.util.*;
public class Day24_20201022 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스 수 입력
		int T = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 수 만큼 반복
		for(int i=0; i<T; i++) {
			
			//  R과 S는 공백으로 구분되어 주어짐 -> StringTokenizer
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			// 입력한 S의 길이만큼 반복
			for(int j=0; j<S.length(); j++) {
				
				// 테스트 케이스 반복 횟수 만큼 
				for(int a=0; a<R; a++) {
					// 문자열 S의 charAt(j)만큼 반복하여 입력
					bw.write(S.charAt(j));
				}
			}
			// 입력 하나가 끝나면 개행
			bw.newLine();
		}
		bw.flush();
	}
}