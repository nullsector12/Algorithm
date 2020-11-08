package daily_Algorithm;

/*
 *  2020. 10. 25 Daily Algorithm 
 *  Day27 - baekjoon 단계별 문제풀이 문제번호 2908, 5622
 * 	상수, 다이얼
 * 
 */

import java.io.*;
import java.util.*;

public class Day24_20201025 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 2908 상수
//		st = new StringTokenizer(br.readLine());
//		while(st.hasMoreTokens()) {
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			int sangSu_A = ((A%10)*100)+(((A/10)%10)*10)+(A/100);
//			int sangSu_B = ((B%10)*100)+(((B/10)%10)*10)+(B/100);
//			
//			if(sangSu_A > sangSu_B) {
//				System.out.println(sangSu_A);
//			}else {
//				System.out.println(sangSu_B);
//			}
//		}
		
		// 5622 다이얼
		Map<Character, Integer> dial = new HashMap<>();
		
		for(int i=0; i<26; i++) {
			char key = (char)('A'+i);
			
			switch(key) {
				case 'A': case'B': case'C':
					dial.put(key, 3);
					break;
				case 'D': case 'E': case 'F':
					dial.put(key, 4);
					break;
				case 'G': case 'H': case 'I':
					dial.put(key, 5);
					break;
				case 'J': case 'K': case 'L':
					dial.put(key, 6);
					break;
				case 'M': case 'N': case 'O':
					dial.put(key, 7);
					break;
				case 'P': case 'Q': case 'R':case 'S':
					dial.put(key, 8);
					break;
				case 'T': case 'U': case 'V':
					dial.put(key, 9);
					break;
				case 'W': case 'X': case 'Y':case 'Z':
					dial.put(key, 10);
					break;
			}
		}
		
		String call = br.readLine();
		int time = 0;
		for(int i=0, j=call.length(); i<j; i++) {
			time += dial.get(call.charAt(i));
		}
		System.out.println(time);
	}
}