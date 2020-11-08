package daily_Algorithm;

/*
 *  2020. 10. 11 Daily Algorithm 
 *  Day13 - baekjoon 단계별 문제풀이 문제번호 2577
 * 	숫자의 개수
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day12_20201011 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String ABC = Integer.toString(A*B*C);
		
//		int[] num = new int[ABC.length()];
//		for(int i=0; i< num.length;i++) {
//			num[i] = Integer.parseInt(ABC.substring(i,i+1));
//		}
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<ABC.length(); j++) {
				if(i == Integer.parseInt(ABC.substring(j,j+1))) {
					count++;
				}
			}
			bw.write(count+"\n");
		}
		bw.flush();
		
		
//		for(int i=0; i<10; i++){
//			int count = 0;
//			for(int j=0; j<num.length; j++) {
//				if(i == num[j]) {
//					count++;
//				}
//			}
//			bw.write(count+"\n");
//		}
//		
//		bw.flush();

	}

}