package daily_Algorithm;

/*
 *  2020. 11. 09 Daily Algorithm 
 *  Day36 - baekjoon 단계별 문제풀이 문제번호 1018
 * 	체스판 다시 칠하기
 * 
 */

import java.io.*;
import java.util.StringTokenizer;

public class Day36_20201109 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[][] chessBoard;
	static int min = 64; // 8*8이 정사각형 한 구역
	
	// 체스판을 만드는 함수
	public static void chess(int M, int N) throws IOException {
		
		chessBoard = new boolean[M][N];
		
		// 가로길이 만큼
		for(int i=0; i<M; i++) {
			// 블럭을 입력
			String block = br.readLine();			
			
			// 새로 길이만큼
			for(int j=0; j<N; j++) {
				// 입력된 블럭을 charAt으로 잘라 'W'인지 'B'인지 확인
				if(block.charAt(j) == 'W') {
					// 'W'일 경우 true
					chessBoard[i][j] = true;
				}else {
					// 'B'일 경우 false
					chessBoard[i][j] = false;
				}
			}
		}
		
		// 다시 칠할 체스판의 크기는 가로*세로 8*8의 크기
		// 따라서 8*8 = 경우의 수 하나가 된다
		// 주어진 가로/세로 길이에서 -7을 한 만큼이 칠할 정사각형 체스판=하나의 경우의 수가 된다.
		int row = M-7; // 가로의 경우의 수
		int columm = N-7; // 세로의 경우의 수 
		
		// 가로의 경우의 수 만큼 반복
		for(int i=0; i<row; i++) {
			// 세로의 경우의 수 만큼 반복
			for(int j=0; j<columm; j++) {
				// 좌표 x, y를 전달
				countMin(i, j);
			}
		}
		System.out.println(min);
	}
	
	// 바꿔야하는 블럭의 최소 개수를 출력하는 함수
	// x와 y는 체스판 블럭의 좌표를 의미 (2차원 배열)
	public static void countMin(int x, int y) {
		
		int endOfX = x+8; // 주어진 보드의 가로 끝(8)
		int endOfY = y+8; // 주어진 보드의 세로 끝(8)
		int count = 0; // 바꿔야 할 보드의 갯수
		
		// 받은 좌표에 존재하는 보드의 색을 저장
		boolean checkBlock = chessBoard[x][y];
		
		// 경우의 수 x좌표로부터 정사각형 가로 길이의 끝까지
		for(int i=x; i<endOfX; i++) {
			// 경우의 수 y좌표로부터 정사각형 세로 길이의 끝까지
			for(int j=y; j<endOfY; j++) {
				// 만약 처음 주어진 보드판의 요소가 checkBlock의 요소와 같지 않다면
				if(chessBoard[i][j] != checkBlock) {
					// 해당 블럭은 바꿔주어야 하는 블럭이다.
					// 바꿔야 하는 블럭 count를 추가한다.
					count++;
				}
				// 블럭은 W->B->W->... or B->W->B->... 순서로 진행되어야 한다.
				// 따라서 다음 checkBlock은 현재 checkBlock의 반대가 되어야한다.
				checkBlock = !checkBlock;
			}
			// 다음 열도 마찬가지로 처음 열의 첫 행의 반대색이여야 한다. 
			checkBlock = !checkBlock;
		}
		
		// 첫 번째 칸에 주어진 색을 기준으로 색칠할 개수(count)와
		// 그 반대되는 색이 첫 번째 칸에서 시작할 때 색칠할 개수 (총 체스칸 64(8*8) - count)
		// 두 수 중 최소값을 count로 변경
		count = Math.min(count, 64-count);
		
		// 최소값은 이전 경우의 수에 나온 최소값보다 count가 더 작은 지 확인 후
		// 더 작으면 해당 값을 min값으로 새로 저장
		min = Math.min(min, count);
	}
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		
		// 보드의 크기는 M*N
		int M = Integer.parseInt(st.nextToken()); // 가로
		int N = Integer.parseInt(st.nextToken()); // 세로
	
		chess(M, N);
	}
}