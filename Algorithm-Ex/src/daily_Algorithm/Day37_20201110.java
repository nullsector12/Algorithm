package daily_Algorithm;

/*
 *  2020. 11. 10 Daily Algorithm 
 *  Day37 - 사이냅 소프트 신입 개발자 공채 퀴즈 
 * 	사다리 게임 mark.1
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day37_20201110 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[][] stick = new boolean[12][7];
		
		System.out.println(stick[0].length);
		
		String makeLadder = "";
		while(makeLadder != "x") {
			st = new StringTokenizer(br.readLine());

			String check = st.nextToken();
			
			if(check.equals("x")) {
				makeLadder = check;
				break;
				
			}else {
				int columm = Integer.parseInt(check);
				int row = Integer.parseInt(st.nextToken());
				stick[columm][row] = true;
			}
		}
		
		System.out.println("시작점을 입력하세요");
		int startPoint = Integer.parseInt(br.readLine()); 
		for(int i=1; i<stick.length; i++) {
			System.out.println("현재 포인트는 ("+i+", "+startPoint+")");
			if(startPoint > 1 && stick[i][startPoint-1]) {
				startPoint -= 1;
				System.out.println("현재 포인트는 ("+i+", "+startPoint+")");
				
			}else if(stick[i][startPoint]) {
				startPoint += 1;
				System.out.println("현재 포인트는 ("+i+", "+startPoint+")");
			}
		}
		System.out.println("도착!"+startPoint);
	}
}
