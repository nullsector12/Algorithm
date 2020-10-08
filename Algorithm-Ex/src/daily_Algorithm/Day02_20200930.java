package daily_Algorithm;

import java.util.Scanner;

/*
 *  2020. 09. 30 Daily Algorithm 
 *  Day2 - baekjoon 단계별 문제풀이 문제번호 2739번, 10950번, 8393번 
 * 	구구단, A+B-3, 합
 * 
 * 
 */

public class Day02_20200930 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//구구단
		int N = sc.nextInt();

		for(int i=1; i<=9; i++) {
			
			System.out.println(N+" * "+i+" = "+(N*i));
			
		}

		// A+B
		int T = sc.nextInt();
		int A, B;
		
		for(int i=1;i<=T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	
		// 합
		int n = sc.nextInt();
		int result = 0;
		for(int i=1; i<=n; i++) {
			result = result+i;
		}
		System.out.println(result);
		
		
		
	}
	
}