package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 22 Daily Algorithm 
 *  Day64 - Programmers Cording Test Level 1
 *  제일 작은 수 제거하기
 * 
 */

public class Day64_20201222 {
	
    public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		int minIndex = 0;
		int min = arr[minIndex];
		
		
		
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				minIndex = i;
				min = arr[minIndex];
			}
			
			if(i == arr.length-1 || i != 0) {
				System.arraycopy(arr, 0, answer, 0, minIndex);
				System.arraycopy(arr, minIndex-1, answer, minIndex, arr.length-minIndex-1);
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int[] arr = {1};
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}
}
