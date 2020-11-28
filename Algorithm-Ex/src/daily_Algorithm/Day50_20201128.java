package daily_Algorithm;


import java.util.*;

/*
 *  2020. 11. 28 Daily Algorithm 
 *  Day50 - Programmers Cording Test Level 1
 *  문자열 내림차순으로 배치하기
 * 
 */

public class Day50_20201128 {
	
	public static String solution(String s)  {
		
		String answer = "";
		
		
		// 배열로 만들어 정렬 후 역순으로 바꾸기
		String[] slice = new String[s.length()];
		for(int i=0; i<s.length(); i++) {
			slice[i] = (String.valueOf(s.charAt(i)));
		}
		
		Arrays.sort(slice);
		
		for(int i=0; i<slice.length/2; i++) {
		String temp = slice[i];
		slice[i] = slice[(slice.length-1)-i];
		slice[(slice.length-1)-i] = temp;
		}
	
		for(int i=0; i<slice.length; i++) {
			answer += slice[i];
		}
		
		// List로 만들어 역순 정렬
//		ArrayList<String> slice = new ArrayList<String>();
//		for(int i=0; i<s.length(); i++) {
//			slice.add(String.valueOf(s.charAt(i)));
//		}
//		
//		Collections.sort(slice, Collections.reverseOrder());
//		for(String result : slice) {
//			answer += result;
//		}
		
		return answer; 
		}


	public static void main(String[] args) throws Exception{
		String s = "Zbcdefg";
		
		
		System.out.println("결과 : "+ solution(s));
		
	}
}
