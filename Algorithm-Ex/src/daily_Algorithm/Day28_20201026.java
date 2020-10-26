package daily_Algorithm;

/*
 *  2020. 10. 26 Daily Algorithm 
 *  Day28 - baekjoon 단계별 문제풀이 문제번호 2941
 * 	크로아티아 알파벳
 * 
 */

import java.io.*;

public class Day28_20201026 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String croatia = br.readLine(); // 입력값
		
		int result = 0;
		int len = croatia.length(); // 입력한 문자열의 길이
		
		for(int i=0; i<len; i++) {
			
			char key = croatia.charAt(i);
			switch(key){
				// i의 크기는 croatia 문자열의 길이보다 작아야함(charAt은 인덱스이기 때문)
				// 해당 조건은 단독 문자처리 이외의 case if조건에 공통으로 포함되어야함
				// 그렇지 않으면 IndexOutOfBoundException 문제가 발생함
				case 'c': // 'c'가 입력됐을 때,
					
					// i의 크기가 len-1보다 작고, 뒷글자가 '='나 '-'일 경우
					if(i<len-1 &&(croatia.charAt(i+1) == '=' ||croatia.charAt(i+1) == '-' )) {
						result+=1;
						i++; // 'c' 다음 글자까지 한 문자로 인식하므로 다음 key번호를 +1해준다.
						break;
						
					// 'c'뒤에 글자가 위 조건을 모두 충족하지 않을 경우	
					} else {
						// 그냥 'c'가 입력된 것이므로 글자 갯수에 +1하고 key값은 변경하지 않음
						result+=1;
						break;
					}
					
				case 'd' : // 'd'가 입력됐을 때,
					// 뒷글자가 '-'일 경우
					if(i<len-1 &&(croatia.charAt(i+1) == '-')) {
						result+=1;
						i++;
						break;
						
					// 또는 'z''='일 경우 (dz=) 	
					}else if(i<len-2 &&(croatia.charAt(i+1) == 'z' && croatia.charAt(i+2) == '=')) {
						result +=1;
						// 세 글자가 한글자로 인식되는 경우이기에 key번호에 +2를 해준다.
						i +=2;
						break;
					
					// 위의 조건을 모두 충족하지 못할 때 단독으로 'd'만 입력된 처리
					}else {
						result +=1;
						break;
					}
					
				case 'l': case 'n': // 'l'이나 'n'이 입력됐을 때,
					// 뒷글자가 'j'인 경우
					if(i<len-1 &&(croatia.charAt(i+1) == 'j')) {
						result +=1;
						i++;
						break;
					
					// 'l'과 'n'이 조건을 충족하지 않을 때,	
					}else {
						// 단독 글자 취급
						result +=1;
						break;
					}
					
				case 's': case 'z': // 's', 'z'가 입력됐을 때,
					// 뒷글자가 '='인 경우
					if(i<len-1 &&(croatia.charAt(i+1) == '=')) {
						result +=1;
						i++;
						break;
						
					// 's', 'z'가 조건을 충족하지 않을 때,
					}else {
						// 단독 글자 취급
						result +=1;
						break;
					}
					
				case '-': case '=':
					break;
					
				default: // 다른 모든 입력값은
					// 단독 글자 취급
					result +=1;
					break;
			}
		}
		System.out.println(result);
	}
}