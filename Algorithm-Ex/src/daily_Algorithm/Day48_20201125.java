package daily_Algorithm;


import java.util.*;

/*
 *  2020. 11. 25 Daily Algorithm 
 *  Day48 - Programmers Cording Test Level 1
 * 	문자열 내 마음대로 정렬하기
 * 
 */

public class Day48_20201125 {
	
	public static ArrayList solution(String[] strings, int n)  {
		// array 형태로 결과를 반환하기 위해 ArrayList 생성
		ArrayList<String> answer = new ArrayList<String>();
		Arrays.sort(strings, new Comparator<String>() {

			// comparator 익명 클래스 compare() 구현
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1.substring(n, n+1);
				String s2 = o2.substring(n, n+1);
				return s1.compareTo(s2);
			}
			
		});
		
		for(int i=0; i<strings.length; i++) {
			answer.add(strings[i]);
		}
		
		return answer; 
		}


	public static void main(String[] args) throws Exception{
//		String[] strings = {"sun","bed","car"};
		String[] strings = {"abcd","abce","cdx"};
		int n = 2;
		
		System.out.println("결과 : "+ solution(strings, n));
		
	}
}
