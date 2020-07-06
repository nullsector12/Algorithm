package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Bubble_Sort {
	
	/*
	 * 2020. 07. 02 작성
	 * 알고리즘 문제 연습
	 * Title : Bubble sort
	 * Goal	:	1. Bubble sort 에 대해 설명 
	 * 			2. Bubble sort 과정에 대해 설명
	 * 			3. Bubble sort 구현
	 * 
	 * 조건 : 서로 인접한 두 원소의 대소를 비교 -> 조건에 맞지 않는다면 자리를 교환하면서 정렬
	 * */
	
	public static void main(String[] args) {
		
		// ArrayList를 생성
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		// ArrayList 배열에 random 값을 넣어줌
		for (int i = 0; i < 10; i++) {
			int randNum = (int)(Math.random()*100)+1;
			list.add(randNum);
		}
		
		// 저장된 list 배열값 출력
		System.out.println(list);
		
		
		// list의 size만큼 아래 for문을 반복
		for (int j = 0; j < list.size(); j++) {
			
			// 인덱스값을 반환하여 list.size-1번만큼 for문 반복
			// size-1 하는 이유 : i값을 인덱스값으로 사용하기 때문에 
			// 반복을 통해 증가하는 i값(list.size() = 10 / 인덱스 범위는 0~9)이 인덱스 범위를 넘어가지 않기위해 -1을 해준다.
			for(int i = 0;i < list.size()-1; i++) {
			
				// 비교할 숫자를 index i번에서 출력
				int checkNum0 = list.get(i);
				
				// 비교해줄 숫자를 index i+1번에서 출력
				int checkNum1 = list.get(i+1);
				
				// 조건식을 통해 checkNum0 과 checkNum1 을 비교 후 위치를 정렬해줌
				// checkNum0 이 checkNum1 보다 큰 경우
				 if(checkNum0 > checkNum1) {
					// checkNum1 값이 소멸하지 않도록 변수에 저장해줌
					int savecheckNum1 = checkNum1;
					
					// set을 통해 i+1 번에 checkNum0 값을 set 해줌
					list.set(i+1, checkNum0);
					// i번지에 변수로 저장해둔 checkNum1 값을 넣어줌
					list.set(i, savecheckNum1);	
				}
			}
		}
		System.out.println(list);
	}
}
