package daily_Algorithm;

/*
 *  2020. 10. 15 Daily Algorithm 
 *  Day17 - baekjoon 단계별 문제풀이 문제번호 4344
 * 	평균은 넘겠지
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day17_20201015 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine()); // C번 반복
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine()); // N과 점수들을 " "로 구분
			int N = Integer.parseInt(st.nextToken()); // 가장 처음 토큰은 N
			int result = 0; // 입력받은 점수들 전체 합을 저장할 변수
			double count = 0.0; // 평균점수를 넘는 학생의 수
			double percent = 0.0; // 평균점수를 넘는 학생의 비율
			int arr[] = new int[N]; // 학생들의 점수를 담을 배율
			
			for(int j=0; j<N; j++) {
				// N 다음의 토큰들은 배열에 저장 (= 학생들의 점수)
				arr[j] = Integer.parseInt(st.nextToken());
				// 점수 합산
				result += arr[j];
			}

			// 배열에 담은 점수의 수만큼 반복
			for(int a=0; a < arr.length; a++) {
				// 점수합/학생수 = 평균점수보다 큰 점수가 있다면
				if((result/N) < arr[a]) {
					// count에 +1
					count++;
				}
			}
			// 평균점수보다 높은 학생 / 총 학생 수 * 100.0 = 평균보다 높은 학생의 비율
			percent = (count/(double)N)*100.0;
			System.out.println(percent);
			
			// format("%.3f") 소수점 세 번째 자리까지 반올림한 값으로 변환
			bw.write(String.format("%.3f%%%n", percent));
			
			// Math.round은 오답처리됨
			// Why? String.format과 다르게 Math.round는 소수점 아래가 0이면 자동으로 절삭하여 출력
//			bw.write(Double.toString(Math.round((percent*1000)/1000.0))+"%");
		}
			bw.flush();
		
			
	}
	
}