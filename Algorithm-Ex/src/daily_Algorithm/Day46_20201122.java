package daily_Algorithm;


import java.util.*;



/*
 *  2020. 11. 22 Daily Algorithm 
 *  Day46 - Programmers Cording Test Level 1
 * 	나누어 떨어지는 숫자 배열
 * 
 */

public class Day46_20201122 {
	
	public static ArrayList<Integer> solution(int[] arr, int divisor)  {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		// arr 정렬
		Arrays.sort(arr);
		// arr배열 내 요소를 차례로 꺼내 divisor와 나머지를 구함
		for(int i=0; i<arr.length; i++) {
			// 만약 나머지가 0이면 
			if((arr[i]%divisor) == 0) {
				//answer 리스트에 저장
				answer.add(arr[i]);
			}
			
		}	
		// 만약 answer의 크기가 0이면
		if(answer.size() == 0) {
			// -1를 리스트에 저장
			answer.add(-1);
		}
	
		return answer; 
		}


	public static void main(String[] args) throws Exception{
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		
		System.out.println("결과 : "+solution(arr, divisor));
		
	}
}
