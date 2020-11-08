package daily_Algorithm;

/*
 *  2020. 11. 07 Daily Algorithm 
 *  Day35 - baekjoon 단계별 문제풀이 문제번호 7568
 * 	덩치
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day35_20201107 {
		
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] weight = new int[N]; // 몸무게
		int[] tall = new int[N]; // 키
		
		// 몸무게와 키 배열에 데이터 입력
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			tall[i] = Integer.parseInt(st.nextToken());
		}
		
		// 자기 자신을 제외한 모든 경우의 수를 처음부터 끝까지 비교
		for(int i=0; i<N; i++) {
			int grade = 1; // 등수
			for(int j=0; j<N; j++) {
				
				// 조건문 처리가 하나 늘어난 탓인지 이 경우의 수를 배제하는게 오히려 효율이 더 안좋아짐
//				if(i == j) {
//					continue;
//				}
				// 비교대상보다 수치가 낮다면 등수를 +1
				if(weight[j] > weight[i] && tall[j] > tall[i]) {
					grade +=1;
				}
			}
			bw.write(grade+" ");
		}
		
		bw.flush();
		
	}
}