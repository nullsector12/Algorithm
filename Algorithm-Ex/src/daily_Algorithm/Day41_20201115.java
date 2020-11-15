package daily_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 *  2020. 11. 15 Daily Algorithm 
 *  Day41 - Programmers Cording Test Level 1
 * 	크레인 인형뽑기 게임
 * 
 */


public class Day41_20201115 {
	
	static int solution(int[][]board, int[] moves) {
		
		// 뽑힌 인형들을 저장할 ArrayList
		ArrayList<Integer> popUp = new ArrayList<>();
		
		// 크레인이 인형을 뽑아올 칸
		int shell = 0;
		// 결과값 (터진 인형 수)
		int result = 0;
		// 뽑힌 인형 중 가장 나중에 뽑힌 인형 = 가장 먼저 나갈 인형
		int lifo = 0;
		// for~Each를 통해 moves의 값을 꺼냄
		for(int move : moves) {
			// 크레인이 인형을 뽑아올 칸 = moves의 -1(Board의 index값이기 때문)
			shell = move-1;
			
			// 뽑은 인형이 존재할 때
			if(popUp.size() > 0) { 
				// 가장 나중에 뽑은 인형을 저장
				lifo = popUp.get(popUp.size()-1);
			}
			
			// 2차원 배열 board에서 [크레인위치]의 배열의 길이-1 (가장 뒤의 값)부터 반복
			// 인형도 가장 뒤에서부터 뽑혀야하기 때문에
			for(int j=0; j<board.length; j++) {
				// 뽑힌 값이 0이 아니라면
				if(board[j][shell]!=0) {
					// 가장 나중에 뽑은 인형과 현재 뽑은 인형을 비교 후
					if(lifo == board[j][shell]) {
						// 동일한 인형이라면 뽑혀있던 인형 삭제
						popUp.remove(popUp.size()-1);
						// 삭제된 인형은 2개이기에 result는 +2
						result += 2;
					}else {
						// 만약 겹치지 않는다면 뽑은 인형 List에 추가
						popUp.add(board[j][shell]);
					}
					// 인형이 뽑힌 자리는 0으로 변경
					board[j][shell] = 0;
					// 반복 종료
					break;
				}
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args){
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println("결과 : " + solution(board, moves));
		
	}
}
