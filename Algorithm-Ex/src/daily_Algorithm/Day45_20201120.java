package daily_Algorithm;


import java.util.*;



/*
 *  2020. 11. 20 Daily Algorithm 
 *  Day45 - Programmers Cording Test Level 1
 * 	같은 숫자는 싫어
 * 
 */

public class Day45_20201120 {
	
	public static ArrayList<Integer> solution(int[] arr)  {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(answer.size() == 0) {
				answer.add(0, arr[0]);
				continue;
			}else if(arr[i] != answer.get(answer.size()-1)) {
				answer.add(answer.size(), arr[i]);
			}
		}
		
		return answer; 
		}


	public static void main(String[] args) throws Exception{
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		
		System.out.println("결과 : "+solution(arr));
		
	}
}
