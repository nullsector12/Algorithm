package daily_Algorithm;

/*
 *  2020. 11. 03 Daily Algorithm 
 *  Day32 - baekjoon 단계별 문제풀이 문제번호 11729
 * 	하노이의 탑
 * 
 */

import java.io.*;

public class Day32_20201103 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void towerOfHanoi (int N, int fst_Pole, int snd_Pole, int trd_Pole) throws IOException {
		
		// fst_Pole = 1, snd_Pole = 2, trd_Pole = 3
		
		if(N == 1) {
			// N이 1일때 == 원판이 하나일 때, 1번 막대에서 3번 막대로 바로 이동 
			bw.write(fst_Pole+" "+trd_Pole+"\n");
			return;
		}
		
		// N-1개의 원판을 1번 막대에서 2번 막대로 이동
		// N-1, 1(시작), 3(중간지점), 2(옮길 목표)
		towerOfHanoi(N-1, fst_Pole, trd_Pole, snd_Pole);
		
		// 가장 큰 원판을 1번 막대에서 3번 막대로 이동
		bw.write(fst_Pole+" "+trd_Pole+"\n");
		
		// N-1개의 원판을 2번 막대에서 3번 막대로 이동
		// N-1, 2(시작), 1(중간지점), 3(옮길 목표)
		towerOfHanoi(N-1, snd_Pole, fst_Pole, trd_Pole);

		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		// 세번째 막대에 모두 정렬할때 까지 움직여야하는 원판 이동 횟수
		bw.write((int)(Math.pow(2, N)-1)+"\n");
		
		// 입력받은 N개의 원판과 1번, 2번, 3번 막대 생성
		towerOfHanoi(N, 1, 2, 3);
		
		bw.flush();
		bw.close();
		br.close();
	}
}