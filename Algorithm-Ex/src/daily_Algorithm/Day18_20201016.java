package daily_Algorithm;

/*
 *  2020. 10. 16 Daily Algorithm 
 *  Day18 - baekjoon 단계별 문제풀이 문제번호 15596, 4673
 * 	정수 N개의 합, 셀프 넘버
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day18_20201016 {

	// 15596번 문제 풀이
	public long sum(int[] a) {
		
		long result = 0;
		
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
	
	// 4673번 풀이
	// 수열을 계산해 줄 함수 생성
	public static int d(int num) {
		
		// 매개변수 num값 저장
		int sumNum = num;
		
		// num이 0이 될 때까지
		while(num != 0) {
			
			// num = 5678일 경우
			// sumNum = 5678(num) + 5 + 6 + 7 + 8 = 5704 가 되어야함
			// sumNum + (num%10) = +8 -> 첫 번째 자리 수 더해주고
			sumNum = sumNum +(num %10); // 처음 num값 + 첫번째 자리 수(8)
			
			// num에 10을 나눈 몫 = 첫 번째 자리 수를 변경 
			// 5678(8) -> 567(7) -> 56(6) -> 5(5) -> 0 
			num = num/10; // 10을 나누어 첫째 자리를 없앤다.
		}
		
		// sumNum값을 리턴함 = 생성자가 있는 수
		// sumNum으로 리턴되지 않은 값 = Self Number
		return sumNum; 
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 1 ~ 10000까지의 수를 담아줄 배열
		int[] totalNum = new int[10001];
		
		// 인덱스 = sumNum으로 맞추기 위해 1부터 시작함
		for(int n=1; n< 10001; n++) {
			
			// calNum = sumNum
			int calNum = d(n);
			
			// 1~10000의 숫자 
			if(calNum < 10001) {
				// index번호 == sumNum
				totalNum[calNum] = calNum;
			}
		}
		

		for (int selfNum=1; selfNum<10001; selfNum++) {
			
			// totalNum의 동일한 인덱스 번호에 동일한 값이 없는 경우 = Self Number			
			if(totalNum[selfNum] != selfNum) {
				
				// 한 줄씩 출력
				bw.write(selfNum+"\n");
			}
		}
		
		bw.flush();
	}
	
}