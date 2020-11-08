package daily_Algorithm;

/*
 *  2020. 10. 28 Daily Algorithm 
 *  Day30 - baekjoon 단계별 문제풀이 문제번호 1712
 * 	손익분기점
 * 
 */

import java.io.*;
import java.util.StringTokenizer;


public class Day27_20201028 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(C-B<=0) { // C-B가 음수거나 0이면 손익분기점이 생길 수 없음, -1 출력
			System.out.println(-1);
		} else {
			// (고정비용 / (총 수입 - 가변비용))+1 = 손익분기점
			System.out.println((A/(C-B))+1);
		}
	}
}