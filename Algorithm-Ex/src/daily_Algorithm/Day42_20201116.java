package daily_Algorithm;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 *  2020. 11. 16 Daily Algorithm 
 *  Day41 - Programmers Cording Test Level 1
 * 	체육복
 * 
 */


public class Day42_20201116 {
	
	static int solution(int n, int[] lost, int[] reserve) {
		
		int answer = 0;
		// 학생 전체를 담을 HashMap생성
		Map<Integer, Integer> students = new HashMap<Integer, Integer>();
		
		
		// 학생 번호를 Key로, Value를 체육복 소지 개수로 함 = 기본값 1, 여벌 2, 없음 0 
		for(int i=1; i<n+1; i++) {
			students.put(i, 1);
		}
		
		// 여벌을 가진 학생들은 기본 소지수 +1 = 2
		for(int i=0; i<reserve.length; i++) {
			students.put(reserve[i], students.get(reserve[i])+1);
		}
		
		// 도난당한 학생은 기본 소지수 -1 = 0으로 변경
		// 여기서 여벌을 가지고 있던 학생들은 1이 됨.
		for(int i=0; i<lost.length; i++) {
			students.put(lost[i], students.get(lost[i])-1);
		}
		
		
		// 학생 수 만큼 반복하여
		for(int i=1; i<students.size()+1; i++) {
			// i가 1일 경우엔 바로 앞 학생과만 비교함
			if(i == 1) {
				if(students.get(i) == 2 && students.get(i+1) == 0) {
					students.put(i, 1);
					students.put(i+1, 1);
				}
			// i가 1이 아닌 경우 해당 Key값의 학생의 체육벌 소지수 확인
			// 해당 학생의 소지수가 두 벌이고
			}else if (students.get(i) == 2) {
				// 바로 앞 번호 학생이 체육복이 없을 때,
				if(students.get(i-1) == 0) {
					students.put(i, 1);
					students.put(i-1, 1); 
				// 혹은 바로 뒷 번호 학생이 체육복이 없을 때,
				}else if(i < students.size() && students.get(i+1) == 0) {
					students.put(i, 1);
					students.put(i+1, 1);
				}else if(i == students.size() && students.get(i-1) == 0){
					students.put(i, 1);
					students.put(i-1, 1);
				}
			}
			System.out.println(i);
		}
		
		// 학생들 중 소지수가 1이거나 2인 수를 구함
		for(int i=1; i<students.size()+1; i++) {
			System.out.println(students.get(i)+" ");
			if(students.get(i) > 0) {
				answer += 1;
			}
		}
		
		return answer;
		}
	
	
	public static void main(String[] args){
		int n = 5;
		int[] lost = {4};
		int[] reserve = {5};
		
		
		System.out.println("결과 : "+solution(n, lost, reserve));
		
	}
}
