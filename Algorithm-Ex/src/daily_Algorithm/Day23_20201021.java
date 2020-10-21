package daily_Algorithm;

/*
 *  2020. 10. 20 Daily Algorithm 
 *  Day22 - baekjoon 단계별 문제풀이 문제번호 11654, 11720
 * 	아스키 코드, 숫자의 합
 * 
 */

import java.io.*;
import java.util.*;
public class Day23_20201021 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 입력받을 S를, getBytes()로 배열형태로 변경
		byte[] S = br.readLine().getBytes();
		
		// 알파벳들 배열로 저장
		byte[] alphabet = new byte[26]; 
		
		for(int i=0; i<alphabet.length;i++) {
			alphabet[i] = (byte)('a'+ i); // 알파벳들의 기본값을 -1로 초기화
		}
		
		// 배열형태로 변한 S의 길이만큼
		for(int i=0; i<S.length; i++) {
			
			// 알파벳 소문자 'a'의 10진법 표현은 97 
			// S[i]의 아스키 코드 - 'a'(97)를 한 값이 -1이라면
			// ex. S = 'baekjoon', S[0] = 'b', 'b' = 98
			// 98-97 = 1 / alphabet의 초기값은 모두 -1 
			// 모든 알파벳이 '처음' 등장하는 위치이기 때문에 처음 초기화한
			// -1값을 처음 만났을 때만 해당 인덱스의 값을 i값으로 바꿔주면 순서가 정해진다.
			if(alphabet[S[i] - 'a'] == -1) {
				// S[] = {'b', 'a', 'e', 'k', 'j', 'o', 'o', 'n'};
				// ['b'(S[0]) - 'a' = 1] = 0 / 1번 인덱스('b')는 S문자열에서는 0 번째 글자 
				alphabet[S[i] - 'a'] = (byte)i;
			}
		}
		
		for(int val : alphabet) {
			System.out.print(val + " ");
		}
		
		// 실패한 방법 : -1값을 출력하지 못함!!
//		for(int i=0; i<S.length; i++) {
//				int lower = 0;
//				int upper = alphabet.length-1;
//				while(lower <= upper) {
//					int middle = (upper+lower) /2;
//					if(alphabet[middle] == S[i]) {
//						alphabet[middle] = (byte)i;
//						break;
//					}else if (alphabet[middle] < S[i]) {
//						lower = middle +1;
//					}else if (alphabet[middle] > S[i]) {
//						upper = middle-1;
//					}else {
//						alphabet[middle] = -1;
//					}
//			}
//		}
//		for(int result : alphabet) {
//			System.out.print(result + " ");
//		}
		
	}
}