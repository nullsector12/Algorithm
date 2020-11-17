package daily_Algorithm;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/*
 *  2020. 11. 17 Daily Algorithm 
 *  Day41 - Programmers Cording Test Level 1
 * 	2016년
 * 
 */

public class Day43_20201117 {
	
	static String solution(int a, int b) throws Exception {
		Calendar cal = Calendar.getInstance();
		String[] yoils = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		String answer="";
		String month = String.valueOf(a);
		String day = String.valueOf(b);
		
		DateFormat date = new SimpleDateFormat("yyyyMMdd");
		
		if(month.length() == 1) {
			month = "0"+month;
		}
		
		Date d = date.parse("2016"+month+day);
		
		cal.setTime(d);
		
		int yo_il = cal.get(cal.DAY_OF_WEEK);
		
		switch(yo_il){
			case 1:
				answer = yoils[0];
				break;
			case 2:
				answer = yoils[1];
				break;
			case 3:
				answer = yoils[2];
				break;
			case 4:
				answer = yoils[3];
				break;
			case 5:
				answer = yoils[4];
				break;
			case 6:
				answer = yoils[5];
				break;
			case 7:
				answer = yoils[6];
				break;
		}
		
		return answer;
		}


	public static void main(String[] args) throws Exception{
		int a = 5;
		int b = 24;
		
		System.out.println("결과 : "+solution(a, b));
		
	}
}
