package daily_Algorithm;

/*
 *  2020. 10. 27 Daily Algorithm 
 *  Day29 - baekjoon 단계별 문제풀이 문제번호 1316
 * 	그룹 단어 체커
 * 
 */

import java.io.*;

public class Day29_20201027 {
	
public static boolean groupCheck(String s) throws IOException{
		
		// 알파벳 숫자만큼의 true or false를 저장할 배열
		// 앞뒤 글자가 다를 때 이미 한번 입력되었던 알파벳인지 판별하기 위한 배열 
		boolean[] check = new boolean[26];
		
		// 현재 글자의 앞 글자 (apple 에서 l이 현재 글자라면 prev는 p) 
		char prev = '0'; // 이전에 선택된 글자를 저장할 변수
		
		for(int i=0, j=s.length(); i<j; i++) {
			// 현재 선택된 글자
			char now = s.charAt(i);
			
			// 현재 글자와 앞의 글자가 다를 경우
			if(now != prev) {
				// 현재 들어온 알파벳이 한번도 쓰이지 않은 경우
				if(check[now-'a'] == false) {
					// 쓰였다는 정보를 넣어줌
					check[now-'a'] = true;
					// 다음 글자 비교를 위해 now를 prev로 변경
					prev = now; 
				} else {
					// 앞의 글자와 다른데, 이미 한번 쓰인 알파벳이다 = 그룹이 아님
					// false를 return
					return false;
				}
			}
			// 만약 앞뒤 글자가 같으면, 연속된 문자이므로
			// for문을 반복함
			continue;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<N; i++) {
			// 메소드 groupCheck()의 결과가 true일 경우 
			// 글자가 group이라는 의미이므로 result에 +1
			String s = br.readLine();
			if(groupCheck(s) == true) {
				result+=1;
			}
		}
		System.out.println(result);
		br.close();
		
	}
}