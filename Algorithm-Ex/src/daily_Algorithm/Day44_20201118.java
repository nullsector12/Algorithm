package daily_Algorithm;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/*
 *  2020. 11. 18 Daily Algorithm 
 *  Day44 - Programmers Cording Test Level 1
 * 	가운데 글자 가져오기
 * 
 */

public class Day44_20201118 {
	
	static String solution(String s)  {
		String answer = "";
		char split = s.charAt(s.length()/2);
		
		
		if(s.length()%2 == 0) {
			char even = s.charAt((s.length()/2) -1);
			answer = String.valueOf(even) + String.valueOf(split);
		}else {
			answer = String.valueOf(split);
		}
		
		return answer;
//		return s != null ? s.substring((s.length()-1)/2, (s.length()/2)+1) : ""; 
		}


	public static void main(String[] args) throws Exception{
		String s = "abcdefghi";
		
		
		System.out.println("결과 : "+solution(s));
		
	}
}
