package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Quick_Sort {
	
	/*
	 * 2020. 07. 07 작성	 
	 * 알고리즘 연습문제
	 * Title : Quick Sort : 분할 정복 방법(divide and conquer)
	 * Goal	:	1. Quick sort 에 대해 설명 가능
	 * 			2. Quick sort 과정에 대해 설명 가능
	 * 			3. Quick sort 구현
	 * 
	 * # 새로 알게된 단어: 
	 * 	1. 피벗(pivot) - 배열 가운데서 고른 원소 하나의 지칭
	 *  2. 분할 정복(divide and conquer) - 문제를 작은 2개의 문제로 분리하고 각각 해결 후, 결과를 모아서 원래의 문제를 해결하는 전략
	 * 
	 * 조건 : 피벗을 고르고 -> 피벗 앞에는 피벗보다 값이 작은 모든 원소가 위치 -> 뒤에는 피벗보다 값이 큰 모든 원소 위치 -> 피벗은 위치 고정
	 * 		-> 피벗 앞뒤로 새로 생성된 배열에서 새로운 피벗을 골라 위의 방법 재귀적으로 반복
	 * 	
	 * # 재귀 호출이 한번 진행될 때마다 최소한 하나의 원소는 최종적으로 위치가 정해지므로, 이 알고리즘은 반드시 끝난다는 보장이 있다.
	 * 
	 * review :
	 * 
	 * */
	
	public static void main(String[] args) {
		
			int[] arr = new int[10];
			
			for(int i = 0; i < arr.length-1; i++ ) {
				int randNum = (int) (Math.random()*100) + 1;
				arr[i] = randNum;
			}
			System.out.println(Arrays.toString(arr));
			
			
	}
}	

