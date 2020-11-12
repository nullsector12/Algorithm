package daily_Algorithm;

/*
 *  2020. 11. 12 Daily Algorithm 
 *  Day39 - baekjoon 단계별 문제풀이 문제번호 2750
 * 	수 정렬하기
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day39_20201112 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자의 개수 N
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int temp = 0; // 저장해줄 값
		int next = 0; // 다음 값
		int curr = 0; // 현재 값
		
		// 배열의 전체 길이만큼 반복
		for(int i=0, j=arr.length; i<j; i++) {
			// 배열 내부탐색을 위한 반복이기 때문에 비교를 위해 전체 길이-1만큼 반복한다.
			for(int k=0, l=arr.length-1; k<l; k++) {
				curr = arr[k];
				next = arr[k+1];
				// curr(앞의 수)가 next(뒤의 수)보다 크면 둘의 자리를 변경해준다.
				if(curr > next) {
					temp = next;
					arr[k+1] = curr;
					arr[k] = temp;
				}	
			}
		}
		
		for(int i=0, j=arr.length; i<j; i++) {
			System.out.println(arr[i]);
		}
	}
}
