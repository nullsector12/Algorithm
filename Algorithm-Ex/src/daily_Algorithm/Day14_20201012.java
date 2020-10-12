package daily_Algorithm;

/*
 *  2020. 10. 12 Daily Algorithm 
 *  Day14 - baekjoon 단계별 문제풀이 문제번호 3052, 1546
 * 	나머지, 평균
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class Day14_20201012 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
//		// 키값과 Value를 담아줄 Map 선언
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i=0; i<10; i++) {
//			// key를 입력받은 값%42로 설정 why? HashMap은 중복 키값을 허용하지 않음
//			int key = (Integer.parseInt(br.readLine()))%42;
//			
//			// 따라서 같은 key값이 들어오면 value에 +1 해줌
//			map.put(key, map.getOrDefault(key, 0)+1);
//		}
//        
//		// map의 size()만큼 서로 다른 key값, 즉 다른 수가 들어온 것 
//		bw.write(Integer.toString(map.size()));
//		bw.flush();
	
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int M = 0;
		double[] arr = new double[N];
		
		// 입력받은 토큰을 배열에 저장하고
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			// 입력받은 값 중 가장 큰 값을 찾아줌
			if(arr[i]>M) {
				M = (int)arr[i];
			}
		}
		
		double result = 0;
		// 문제에서 원하는 수식에 따라 값을 계산하고 result에 합함
		for(int i=0; i<arr.length; i++) {
			result += arr[i]/M*100;
		}
		
		// 결과 출력
		bw.write(Double.toString(result/N));
		bw.flush();
		
	}

}