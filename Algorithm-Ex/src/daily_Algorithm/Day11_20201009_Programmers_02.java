package daily_Algorithm;

import java.util.*;

/*
 * 2020. 10. 08 Daily Algorithm
 * Day10 - 프로그래머스 코딩테스트 연습 [정렬] 첫번째 문제 - "K번째수"
 *  	 - 프로그래머스 코딩테스트 연습 [해시] 첫번째 문제 - "완주하지 못한 선수"
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
		}	
	}
	
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
			result.add(i, i+1);
		}
	}
	int[] answer = new int[result.size()];
	
	for(int i =0; i< answer.length; i++) {
		answer[i] = result.get(i);
	}
	Arrays.sort(answer);
	
	return answer;
	}
	
	public static void main(String[] args) {
		Day11_20201009_Programmers_02 sol = new Day11_20201009_Programmers_02();
		
		int[] answers = {1,2,3,4,5};
		sol.solution(answers);
		
		
		System.out.println();
	}
}

