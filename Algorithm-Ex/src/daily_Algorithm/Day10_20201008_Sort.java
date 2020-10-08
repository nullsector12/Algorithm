package daily_Algorithm;

import java.io.*;
import java.util.*;

/*
 * 2020. 10. 08 Daily Algorithm
 * Day10 - 프로그래머스 코딩테스트 연습 [정렬] 첫번째 문제 - "K번째수"
 *  	 - 프로그래머스 코딩테스트 연습 [해시] 첫번째 문제 - "완주하지 못한 선수"
 * 
*/
public class Day10_20201008_Sort {
	
	// 프로그래머스 코딩테스트 연습 [정렬] 첫번째 문제 - "K번째수" 
	public int[] solution(int[] array, int[][] commands) throws IOException{
		
		int[] answer = new int[commands.length];
		for(int i=0; i< commands.length; i++) {
			
			int startIndex = commands[i][0];
			int endIndex = commands[i][1];
			int k = commands[i][2];
			
			int[] temp = Arrays.copyOfRange(array, startIndex, endIndex);
			Arrays.sort(temp);
			answer[i] = temp[k-1];
		}		
		return answer;
	}
	
	public String solution(String[] participant, String[] completion){
		
	// 프로그래머스 코딩테스트 연습 [해시] 첫번째 문제 - "완주하지 못한 선수"	
	
	// 첫번째 답안 결과 : 오답 (효율성 시간초과)	
	String answer = "";
	
//	for(int i=0; i<participant.length; i++) {
//		
//		for(int j=0; j<completion.length; j++) {
//			
//			if(participant[i].equals(completion[j])) {
//				participant[i] = null;
//				completion[j] = null;
//				break;
//			}
//			
//		}
//	}
//	for(int a=0; a<participant.length; a++) {
//		if(participant[a] != null) {
//			answer = participant[a];
//			break;
//		}
//	}
	
	// 두번째 답안 결과 : 정답
	// 해시를 사용한 게 아니라 풀고나니 Array를 사용하여 풀었다. 해시로 다시 풀어봐야 함
	Arrays.sort(participant);
	Arrays.sort(completion);
	int i = 0;
	for(;i<completion.length; i++) {
		if(!(participant[i].equals(completion[i]))) {

			return participant[i];
			
		}
	}
		return 	participant[i];
	}
	
}

