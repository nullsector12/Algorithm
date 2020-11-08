package daily_Algorithm;

/*
 *  2020. 11. 04 Daily Algorithm 
 *  Day33 - baekjoon 단계별 문제풀이 문제번호 2798
 * 	블랙잭
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day33_20201104 {
		
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] card = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0; // M과 가장 가까운 카드 합
		int first = 0; // 첫번째 카드
		int second = 0; // 두번째 카드
		int third = 0; // 세번째 카드
		int jack = 0; // 3개 카드의 합
		
		// 주어진 숫자 중 3개의 카드 선택, 마지막 2개 수를 제외한 수만큼 반복 
		for(int i=0; i<N-2; i++) {
			
			// 첫 번째 카드
			first = card[i];
			// 첫번째 카드가 M보다 크면 카드 다시 뽑음
			if(first > M) {
				continue;
			}
			
			// 두 번째 카드는 첫 번째 카드 다음부터 뽑음, i+1/ 두 번째 카드는 첫 번째 카드를 제외한 N-1번까지 반복
			for(int j=i+1; j<N-1;j++) {
				
				// 두 번째 카드
				second = card[j];
				// 첫 번째 카드와 두 번째 카드 합이 M보다 크면 카드 다시 뽑음
				if(first+second > M) {
					continue;
				}
				
				// 세 번 째 카드는 두 번째 카드 다음부터 뽑음, j+1/ 세 번째 카드는 두 번째 카드 다음부터 N번까지 반복
				for(int k=j+1; k<N; k++) {
					
					third = card[k];
					
					jack = first + second + third;
					
					if(jack == M) {
						result = jack;
						break;
						//return;
					}
					
					if(jack < M && jack > result) {
						result = jack;
						
					}
				}
			}
		}
		
//		System.out.println(result);
		// 않이이개외않돼?
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}
}