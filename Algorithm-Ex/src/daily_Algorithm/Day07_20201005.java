package daily_Algorithm;

/*
 *  2020. 10. 05 Daily Algorithm 
 *  Day7 - baekjoon 단계별 문제풀이 문제번호 10952번, 10951번, 1110번
 * 	A+B - 5 / A+B - 4 / 더하기 사이클
 * 
 * 	EOF?
 * 	End Of File (파일의 끝)
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class Day07_20201005 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		// A+B - 5
//		while(true) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			int sum = A+B;
//			
//			
//			if(sum != 0) {
//				bw.write(sum+"\n");
//				
//				
//			} else if(sum == 0){
//				bw.flush();
//				return;
//			}
//		} // while & A+B - 5 end
		
		// A+B - 4 (EOF)
//		String eof;
//		
//		while((eof=br.readLine())!=null) {
//			
//			st = new StringTokenizer(eof);
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			int sum = A+B;
//			bw.write(sum+"\n");
//		} while end
//		bw.flush(); // A+B - 4 end
		
		// 더하기 사이클
		int N = Integer.parseInt(br.readLine());
		int n = N;
		int sum = 0;
		int cycle = 0;
		
		while(true) {
			int frontNum = (n/10); // 주어진 수의 십의 자리 수
			int backNum = (n%10); // 주어진 수의 일의 자리 수
			sum = frontNum+backNum; // 두 값의 합
			n = (backNum*10)+(sum%10); // 새로운 수 = 일의 자리 수를 십의 자리 수 값으로, 두 값의 합의 일의 자리 수 값을 일        의 자리 값으로
			cycle++;
			
			if(n == sum) {
				bw.write(cycle+"");
				bw.flush();
				break;
			}
		}
		
	}
}