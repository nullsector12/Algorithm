package daily_Algorithm;

import java.util.*;

/*
 * 2020. 10. 09 Daily Algorithm
 * Day11 - 프로그래머스 코딩테스트 연습 [완전탐색] 첫번째 문제 - "모의고사"
 *  	 
 * 
*/
public class Day11_20201009_Programmers_02 {
	public int[] solution (int[] answers) {
		
	int supoja = 3;
	int[][] supoAnswers = 
			new int[][] {{1, 2, 3, 4, 5}, 
						{2, 1, 2, 3, 2, 4, 2, 5}, 
						{3, 3, 1, 1, 2, 2, 4,4 ,5 ,5}};

	int[] point = new int[supoja]; // 문제 맟힌 갯수를 담을 배열, 배열의 길이 = 수포자의 인원
	
	for(int i=0;i < answers.length; i++) {
		for(int j=0; j<supoja; j++) { // 수포자 인원 만큼 반복
			if(answers[i] == supoAnswers[j][i % supoAnswers[j].length]) {
				point[j] += 1;	
			}
			// 실패한 방법 : i의 값이 변하지 않아서 전체 답안의 비교가 불가능
//			for(int k=0; k<supoAnswers[j].length;k++) {
//				if(answers[i] == supoAnswers[j][k]) {
//					point[j] +=1;
//				}
//			}
		}	
	}

	// 실패한 답안 2
//	for(int i=0;i < supoja; i++) {
//		for(int j=0; j<supoAnswers[i].length; j++) { 
//			for(int k=0; k<answers.length; k++) {
//				if(answers[k] == supoAnswers[i].length) {
//					point[i] +=1;
//				}
//			}
//		}	
//	}
	
	// 가장 많이 맞춘 숫자를 찾음
	int highScore = 0;
	for(int i=0; i<point.length; i++) {
		if(point[i] != 0 && point[i] >= highScore) {
			highScore = point[i];
		}
	}
	
	
	if(highScore == 0) {
		return new int[] {};
	}
	
	List<Integer> result = new ArrayList<Integer>(); // 결과를 담을 List
	for(int i =0; i < supoja; i++) {
		if(point[i] == highScore) {
			result.add(i);
		}
	}
	int[] answer = new int[result.size()];
	
	for(int i =0; i< answer.length; i++) {
		answer[i] = result.get(i)+1;
	}
	Arrays.sort(answer);
	System.out.println(Arrays.toString(answer));
	
	return answer;
	}
	
	public static void main(String[] args) {
		Day11_20201009_Programmers_02 sol = new Day11_20201009_Programmers_02();
		
		int[] answers = {1,3,2,4,2};
		sol.solution(answers);
	}
}

