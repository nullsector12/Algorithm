package daily_Algorithm;

/*
 *  2020. 11. 10 Daily Algorithm 
 *  Day37 - 사이냅 소프트 신입 개발자 공채 퀴즈 
 * 	사다리 게임 mark.1
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 * @packageName	: daily_Algorithm
 * @fileName	: Day37_20201110.java
 * @author		: 김승연
 * @date		: 2020.11.10
 * @description	: 
 * ===================================================
 * DATE				AUTHOR				NOTE
 * ---------------------------------------------------
 * 2020.11.10  		김승연			First Create
 *
 */
public class Day37_20201110 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	static StringTokenizer st;
	static boolean[][] ladder;
	
	
	
	/**
	 *
	 * @methodName	: makeLadder
	 * @author		: 김승연
	 * @date		: 2020.11.10
	 * @param ladder
	 * @return boolean[][]
	 * @throws IOException
	 */
	public static boolean[][] makeLadder(boolean[][] ladder) throws IOException {
		
		System.out.println("만드실 사다리 정보를 입력해주세요.");
		System.out.println("사다리 만드는 법 : 1~10의 범위의 숫자 + 공백 + 1~"+ladder[0].length+"의 범위의 숫자를 입력하고"
		+"\n"+"enter를 누르시면 다음 사다리를 입력 할 수 있고,"
		+"\n"+"사다리 입력이 완료됐다면 x를 입력하고 enter하시면 됩니다.");
		
		
		while(true) {
			st = new StringTokenizer(br.readLine());

			String check = st.nextToken();
			
			if(check.equals("x")) {
				System.out.println("사다리 생성을 종료합니다... 게임을 시작합니다!");
				System.out.println("	Good Luck	");
				System.out.println("===================================");
				break;
				
			}else {
				int columm = Integer.parseInt(check);
				int row = Integer.parseInt(st.nextToken());
				ladder[columm][row] = true;
			}
		}
		return ladder;
	}
	
	/**
	 *
	 * @methodName	: game
	 * @author		: 김승연
	 * @date		: 2020.11.10
	 * @param ladder
	 * @throws IOException
	 */
	public static void game(boolean[][] ladder) throws IOException {
		
		while(true) {
			System.out.println("시작점을 입력하세요");
			String startPoint = br.readLine();
			if(startPoint.equals("x")) {
				System.out.println("게임을 종료합니다!");
				break;
			}
			int point = Integer.parseInt(startPoint);
			for(int i=1; i<ladder.length; i++) {
				System.out.println("현재 포인트는 ("+i+", "+point+")");
				if(point > 1 && ladder[i][point-1]) {
					point -= 1;
					System.out.println("현재 포인트는 ("+i+", "+point+")");
					
				}else if(ladder[i][point]) {
					point += 1;
					System.out.println("현재 포인트는 ("+i+", "+point+")");
				}
			}
			System.out.println("도착! "+point);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		System.out.print("게임에 참여할 인원이 몇명인가요? : ");
		
		ladder = new boolean[12][Integer.parseInt(br.readLine())+1];
		
		game(makeLadder(ladder));
		

	}
}
