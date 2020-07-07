package algorithm;

import java.util.ArrayList;

public class Selection_Sort {
	
	/*
     * 2020. 07. 02 작성
     * 알고리즘 문제 연습
     * Title : Selection sort
     * Goal    :    1. Selection sort 에 대해 설명 
     *             2. Selection sort 과정에 대해 설명
     *             3. Selection sort 구현
     * 
     * 조건 : 주어진 배열에서 최소값 찾기 -> 해당 최소값을 맨 앞에 위치한 값과 교체-> 맨 처음 위치를 뺀 나머지 위치에서 반복
     */
	
	public static void main(String[] args) {
		

		ArrayList <Integer> list = new ArrayList<Integer>();
		

		for (int i = 0; i < 10; i++) {
			int randNum = (int)(Math.random()*100)+1;
			list.add(randNum);
		}

		System.out.println(list);
		
		// 최소값 Index번호와 변경할 값을 저장할 변수 선언
		int minIndex, change;
		
        // list 내부의 최소값 비교 반복을 위한 for문
        // list.size()-1 하는 이유 : 마지막 반복이 size인 10의 -1번째에서 끝나도록 하기 위해
        // size = 10일 때 인덱스 번호는 0 ~ 9
		for (int i = 0; i < list.size()-1; i++) {
			
			// list 내의 최소값을 저장할 Index 설정
			minIndex = i;
			
			// list 내의 값들과 비교하기 위한 for 반복문
			for(int j = i+1; j < list.size(); j++) {
				//  i+1번 인덱스의 값이 i번 인덱스 값보다 작으면
				 if(list.get(j) < list.get(minIndex)) {   
					 // 최소값 Index 번호는 j로 변경
					 minIndex = j;
					 
					// list[1] < list [0] =  minIndex -> [1]
				}
			}
            // 자리 변경을 위해 change 에  minIndex의 값 저장 
            // change = list[1]
			change = list.get(minIndex);
			
			// list의 minIndex=j번 인덱스에 i번 인덱스의 값 저장
			// list[1] = list[0]
			list.set(minIndex, list.get(i)) ;
		
			// list의 i번 인덱스에 minIndex=j번 인덱스의 값 저장
			// list[0] = list[1]
			list.set(i, change);
		}
		System.out.println(list);
	}
}
