package daily_Algorithm;

import java.util.*;
public class Solution {

	public String solution(String[] votes, int k) {
		
		List<String> car = new ArrayList<String>();
		Map<String, Integer> point = new HashMap<String, Integer>();
		
		for(int i=0; i<votes.length;i++) {
			int vote = 1;
			point.put(votes[i], vote);
			for(int j=1; j<votes.length-1;j++) {
				if(votes[i].equals(votes[j])) {
					vote++;
					point.replace(votes[i], vote);
				}
				if(!votes[i].equals(votes[j])){
					
					
				}
			}
		}
		
		
		
		return "";
	}
	
	public static void main(String[] args) {
		
		int k = 2;
		String[] votes = {"AVANT", "PRIDO", 
				"SONATE", "RAIN", "MONSTER", 
				"GRAND", "SONATE", "AVANT", 
				"SONATE", "RAIN", "MONSTER", 
				"GRAND", "SONATE", "SOULFUL", 
				"AVANT", "SANTA"};
		
		Solution sol = new Solution();
		
		
		sol.solution(votes, k);
	}
	
}
