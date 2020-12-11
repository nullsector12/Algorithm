package daily_Algorithm;

/*
 *  2020. 12. 08 Daily Algorithm 
 *  Day54 - Programmers Cording Test Level 1
 *  수박수박수박수박수?
 * 
 */

public class Day52_20201201 {
	
	public static String solution(int n) {
		
		String answer = "";
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				answer += "수";
			}else if(i%2 == 0) {
				answer += "박";
			}
		}
		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		int n = 10000;
		
		System.out.println("결과 : "+ solution(n));
		
	}
}
