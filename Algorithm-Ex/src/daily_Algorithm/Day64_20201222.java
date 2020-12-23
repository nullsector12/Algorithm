package daily_Algorithm;

import java.util.*;

/*
 *  2020. 12. 22 Daily Algorithm 
 *  Day64 - Programmers Cording Test Level 1
 *  제일 작은 수 제거하기
 * 
 */

public class Day64_20201222 {
	
    public static List<Integer> solution(int[] arr) {
		
    	List<Integer> answer = new ArrayList<Integer>();
    	// arr의 길이가 1이거나 0일 때,
    	if(arr.length == 1 || arr.length == 0) {
    		answer.add(-1);
    		return answer;
		}
		
    	// int형인 arr을 Wrapper Class인 Integer형으로 변환
    	Integer[] castArr = Arrays.stream(arr)
    			.boxed()
    			.toArray(Integer[]::new);
    	
    	// Integer형으로 변환한 배열을 다시 List로 변환하여 복사
    	// asList는 Immutable한 List라 new 생성자를 통해
    	// 새로 선언해주어야 remove나 addAll등의 메소드 사용이 가능하다.
    	answer = new ArrayList<>(Arrays.asList(castArr));
		
    	// 해당 List 내에서 가장 작은 수의 index번호를 구함
		int minIndex = answer.indexOf(Collections.min(answer));
		
		// List내에서 해당 인덱스번호의 요소를 제외해줌
		answer.remove(minIndex);
		
		return answer;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int[] arr = {4,3,2,1};
		
		System.out.println(solution(arr));
		
	}
}
