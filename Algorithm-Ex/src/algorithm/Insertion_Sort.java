package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Sort {
	
    /*
     * 2020. 07. 06 작성
     * 알고리즘 문제 연습
     * Title : Insertion Sort
     * Goal    :    1. Selection sort 에 대해 설명 
     *             2. Selection sort 과정에 대해 설명
     *             3. Selection sort 구현
     * 
     * 조건 : 정렬은 2번째 index의 값을 temp에 저장 -> temp와 이전 원소들을 비교하며 삽입 -> '1'번으로 돌아가 다음 index의 값을 temp에 저장, 반복
     * 
     * review :
     * 
     *        1. 한번 뽑아서 임시저장한 값을 자리만 변경하고 값을 바꾸면 안되는데 이전 Sort들을 생각하느라 새 값을 대입하여 반복적으로 비교하지 못함.
     *        2. 얼만큼 반복해야 할 지 모르는데 앞에서 계속 써온 for문만 고집함. 한가지 방법이나 방향이 아닌 다양한 접근법도 고려해보자.
     *        3. 솔직히 list 쓰면 sort 개편하다.
     *        4. 손코딩 후 IDE에 옮겨 구현해보고 결과가 다른 이유에 대해 해결 후 다시 손코딩으로 하나하나 확인해보자.
     * 
     * */
	
	public static void main(String[] args) {
		
			int[] arr = new int[10];
			
			for(int i = 0; i < arr.length-1; i++ ) {
				int randNum = (int) (Math.random()*100) + 1;
				arr[i] = randNum;
			}
			System.out.println(Arrays.toString(arr));
			
			
			
			// 첫번째 인덱스 앞에는 아무 값도 없기때문에 두번째 인덱스부터 탐색 시작
			for(int i = 1; i < arr.length; i++) {
				int temp = arr[i];  // 두번째 인덱스 값을 temp에 임시저장
				int prev = i-1; // temp값 이전의 인덱스 값 저장
				while( (prev >= 0) && (arr[prev] > temp) ) { // 이전값 인덱스는 0이 되지 않고, 이전값이 temp값보다 크면
					arr[prev+1] = arr[prev]; // 이전값 바로 앞자리(temp 자리)에 이전 자리의(prev 자리)값을 저장하고
					prev--; // 이전값을 더 이전 위치로 이동한다.(음수가 되면 자동으로 while문 정지)
				}
				arr[prev + 1] = temp; 
				// prev가 음수가 되거나 temp값이 이전값보다 큰 경우 while루프를 나오면
				// 자동으로 prev에는 현재 temp값보다 작은 값들 중에서 제일 큰 값의 위치를 가리킴
				// 이전값 바로 앞에 현재 temp값을 삽입해준다.
		}
		System.out.println(Arrays.toString(arr));
	}
}	

