package daily_Algorithm;

/*
 *  2020. 10. 23 Daily Algorithm 
 *  Day25 - baekjoon 단계별 문제풀이 문제번호 1157
 * 	단어 공부
 * 
 */

import java.io.*;
import java.util.*;


public class Day25_20201023 {
	
	// 입력받은 단어의 알파벳들을 키값으로 중복된 키가 들어오면 value를 +1 해주는 메소드
	public static Map keyAndValue (byte[] S) {
		
		Map<Byte, Integer> count = new HashMap<>();
		
		for(int i=0; i<S.length; i++) {
			if(S[i]>96) {
				// 'A'~'Z' = 65~90 / 'a' ~ 'z' = 97~122
				S[i] = (byte)(S[i]-32);
			}
			// 이미 키값이 존재한다면 해당 key에 해당하는 value에 +1
			if(count.containsKey(S[i])) {
				count.computeIfPresent(S[i], (k,v)->v+1);
			}else {
				// 없다면 새로운 key와 value를 put
				count.put(S[i], 1);
			}
		}
			return count;
	}
	
	// 메소드 keyAndValue에서 return받은 count에서 키값과 밸류값을 뽑아내
	// 결과를 출력하기 위한 메소드
	public static void print(Map count) {
		// key를 set해줌
		Set set = count.keySet();
		Iterator itr = set.iterator();
		
		// set한 key들을 담을 배열 생성
		byte[] key = new byte[set.size()];
		
		for(int i=0; i<set.size(); i++){
			// key값을 배열에 저장
			key[i] = (byte)itr.next();
		}
		
		int max = 0; // 중복된 알파벳이 가장 많은 수
		int compare = 0; // 중복값을 비교할 수
		int idx = 0; // 중복이 가장 많았던 알파벳을 찾아줄 index번호를 저장할 변수
		
		for(int i=0; i<count.size(); i++) {
			
			// key[i] 키값에 해당하는 value가 max보다 크거나 같으면 
			if((int)count.get(key[i]) >= max) {
				compare = max; // compare에 이전 max값을 담아두고 
				max = (int)count.get(key[i]); // max를 새로 변경
				idx = i; // 중복이 가장 많은 알파벳의 key값을 찾기 위한 index번호 저장 
			}
		}
		// max와 compare가 같다면 ? 출력
		if(max == compare) {
			System.out.println("?");
			
		// 아니라면 key[idx] key값에 해당하는 byte값을 char로 캐스팅하여 출력
		}else {
			System.out.println((char)key[idx]);
		}
	
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte[] S = br.readLine().getBytes();
		
		print(keyAndValue(S));	
	}
}