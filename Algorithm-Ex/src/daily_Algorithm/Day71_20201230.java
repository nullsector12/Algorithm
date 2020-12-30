package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 30 Daily Algorithm 
 *  Day71 - Programmers Cording Test Level 1
 *  행렬의 덧셈
 * 
 */

public class Day71_20201230 {
	
    public static int[][] solution(int[][] arr1, int[][] arr2) {
		
    	int[][] answer = new int[arr1.length][arr1[0].length];
    	
    	for(int i=0; i<answer.length; i++) {
    		
    		for(int j=0; j<answer[i].length; j++) {
    			
    			answer[i][j] = arr1[i][j] + arr2[i][j];
    		}
    	}

		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		
		System.out.println(solution(arr1, arr2));
		
	}
}
