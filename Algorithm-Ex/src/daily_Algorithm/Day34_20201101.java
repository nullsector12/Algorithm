package daily_Algorithm;

/*
 *  2020. 11. 01 Daily Algorithm 
 *  Day34 - baekjoon 단계별 문제풀이 문제번호 2447
 * 	별 찍기-10
 * 
 */

import java.io.*;

public class Day34_20201101 {
	 
	public static char[][] stars;
	
	public static void pattern (int x, int y, int N, boolean blank) {
		
		// blank가 true일 때,
		if(blank) {
			for(int i=x; i<x+N; i++) {
				for(int j=y; j<y+N; j++) {
					stars[i][j] = ' ';
				}
			}
			return;
		}
		
		// 더 이상 블록이 나눠지지 않을 때,
		if(N==1) {
			stars[x][y]='*';
			return;
		}
		
		int block = N/3; // block의 사이즈는 (N/3) * (N/3)
		int cnt_blank = 0; // blank는 5번째 자리마다 발생
		
		for(int i=x; i < x+N; i += block) {
				
			for(int j=y; j< y+N; j += block) {
				cnt_blank++;
				if(cnt_blank == 5) {
					// 5번째 자리는 공백칸
					pattern(i, j, block, true);
				} else {
					// 나머지 자리는 별 삽입
					pattern(i, j, block, false);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int k = Integer.parseInt(br.readLine());
//		int N = (int) Math.pow(3, k);
		
		int N = Integer.parseInt(br.readLine());
		
		stars = new char[N][N];
		
		pattern(0, 0, N, false);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				bw.write(stars[i][j]);
			}
			bw.write("\n");
		}
	
		bw.flush();
		
	}
}