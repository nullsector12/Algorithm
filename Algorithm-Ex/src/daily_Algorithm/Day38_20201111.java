package daily_Algorithm;

/*
 *  2020. 11. 11 Daily Algorithm 
 *  Day38 - baekjoon 단계별 문제풀이 문제번호 1436
 * 	영화감독 숌
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day38_20201111 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N번째 상영 영화
		int N = Integer.parseInt(br.readLine());
		
		// 영화 넘버링 , 첫작품의 넘버링은 666
		int numbering = 666;
		
		// 영화 발표 횟수
		int count = 1; 
		
		// 발표 횟수와 영화 상영의 수가 같아지면 종료
		while(count != N) {
			// 영화 번호를 하나씩 더해줌
			numbering++;
			// 넘버링에 666이라는 문자열이 나타날 때마다 
			if(String.valueOf(numbering).contains("666")) {
				// 발표 횟수를 더해줌
				count++;
			}
		}
		System.out.println(numbering);
	}
}
