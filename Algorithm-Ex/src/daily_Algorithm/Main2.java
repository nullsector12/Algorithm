package daily_Algorithm;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
	 
	 
	  // 게임 참여 인원
	  char[] join = new char[numOfAllPlayers];
	  for(int i=0, j=join.length; i<j; i++) {
		  join[i] = (char)('A'+i);
	  }
	  
	  // 게임판
	  Map<Integer, Character> board = new TreeMap<>();
	  for(int i=0, j=join.length; i<j-1; i++) {
		   board.put(i, join[i+1]);
	   }
	 
	 
	 int oldSugern = 0; // 이전 수건 위치
	 char sule = join[0]; // 술래의 이름 : 초기값은 'A'
	 int[] result = new int[join.length]; // 술래가 된 횟수 저장할 배열 
	 result[0] = 1;
	 for(int i=0; i<namesOfQuickPlayers.length; i++) {
		 System.out.println(namesOfQuickPlayers[i]);
	 }
	 for(int i=0; i<numOfGames; i++) {		 
		 int sugern = numOfMovesPerGame[i]; // 현재 수건의 위치
		 char runner = board.get(oldSugern + sugern);
		 System.out.println(runner);
		 System.out.println("술래 누구여1:" +sule);
		 System.out.println(sule-'A');
		 for(int j=0; j<namesOfQuickPlayers.length; j++) {
			 
			 if(runner == namesOfQuickPlayers[j]) {
				 System.out.println("쥰내 빠르네;;");
				 System.out.println("술래 누구여2" + sule);
				 result[sule-'A'] +=1;
				 oldSugern = sugern;
				 sule = board.get(oldSugern);
			 }else {
				 System.out.println("개느리네 허접쉑 ㅋㅋ");
				 System.out.println("술래 누구여3" + sule);
				 result[runner-'A'] +=1;
				 board.put(sugern, sule);
				 sule = runner;
				 System.out.println("바뀐 술래는 누구여~" + sule);
				 oldSugern = sugern;
				 break;
			 }
		 }
	 }
	 
	  for(int i=0, j=join.length; i<j; i++) {
		  
		  System.out.println(join[i]+" "+result[i]);
	  }
  }
  
  private static class InputData {
    int numOfAllPlayers;
    int numOfQuickPlayers;
    char[] namesOfQuickPlayers;
    int numOfGames;
    int[] numOfMovesPerGame;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
      for(int i = 0; i < inputData.numOfGames ; i++){
        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
  }
}