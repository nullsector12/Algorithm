package daily_Algorithm;

import java.io.*;
import java.util.StringTokenizer;

/*
 *  2020. 10. 01 Daily Algorithm 
 *  Day3 - baekjoon 단계별 문제풀이 문제번호 15552번
 * 	빠른 A+B
 * 
 * BufferedReader / BufferedWriter / StringTokenizer를 이용한 입출력방식 연습
 * 기존의 입출력은 Scanner와 System.out을 위주로 사용하였으나 
 * 속도면에서 Buffer를 사용하는 것이 더욱 좋다. 
 * BufferdReader / BufferedWriter / StringTokenizer에 대한 자세한 설명은 블로그 참조
 * https://blog.naver.com/rlatmd017/222104730098
 * 
 * 
 */

public class Day3_20201001 {
	
	public static void main(String[] args) throws IOException { // IO Exception처리 필수
		
		// Reader와 Writer를 선언
		// 각각 InputStreamReader와 OutputStreamWriter를 통해 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// read로 입력받은 데이터를 가공하기 위한 Tokenizer 선언
		// BufferedReader로 입력한 값은 전부 String으로 리턴되므로 토큰화하여 가공해야함
		StringTokenizer st;
		
		// String값이 리턴되므로 필요한 형태로 형변환 해줘야한다.
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i <T; i++) {
			
			// String으로 입력받은 값을 Token화 하여
			st = new StringTokenizer(br.readLine());
			
			// 토큰별로 잘라서 원하는 형태로 데이터 형변환 후
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			int result = A+B;
			
			// 결과 출력
			bw.write(result +"\n"); // 자동 줄바꿈이 없기때문에 "\n"을 통해 줄바꿈해준다.
			
		}
		
		// Writer의 경우 반드시 flush()나 close()를 호출해 닫아주어야 한다.
		bw.flush();	
		
	}
	
}
