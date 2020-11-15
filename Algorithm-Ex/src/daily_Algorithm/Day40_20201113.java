package daily_Algorithm;

/*
 *  2020. 11. 13 Daily Algorithm 
 *  Day40 - Programmers Cording Test Level 1
 * 	두개 뽑아서 더하기
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day40_20201113 {
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static ArrayList solution(int[] numbers) {
		int sum = 0;
		
//		Arrays.sort(numbers);
		int length = numbers.length; 
		for(int i=0; i<length-1; i++) {
			for(int j=1; j<length; j++) {
				if(i == j) {
					continue;
				}
				sum = numbers[i] + numbers[j];
				result(sum);
			}
		}
		Collections.sort(result);
		for(int results: result) {
			System.out.print(results+" ");
		}
		
		return result;
	}
	
	
	public static void result(int sum) {
		if(!result.contains(sum)) {
			result.add(sum);
		}
	}
	
	public static void main(String[] args){
		int[] numbers = {5,0,2,7};
		
		solution(numbers);	
		
	}
}
