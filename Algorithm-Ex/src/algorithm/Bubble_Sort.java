package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Bubble_Sort {
	
	/*
	 * 2020. 07. 02 �ۼ�
	 * �˰��� ���� ����
	 * Title : Bubble sort
	 * Goal	:	1. Bubble sort �� ���� ���� 
	 * 			2. Bubble sort ������ ���� ����
	 * 			3. Bubble sort ����
	 * 
	 * ���� : ���� ������ �� ������ ��Ҹ� �� -> ���ǿ� ���� �ʴ´ٸ� �ڸ��� ��ȯ�ϸ鼭 ����
	 * */
	
	public static void main(String[] args) {
		
		// ArrayList�� ����
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		// ArrayList �迭�� random ���� �־���
		for (int i = 0; i < 10; i++) {
			int randNum = (int)(Math.random()*100)+1;
			list.add(randNum);
		}
		
		// ����� list �迭�� ���
		System.out.println(list);
		
		
		// list�� size��ŭ �Ʒ� for���� �ݺ�
		for (int j = 0; j < list.size(); j++) {
			
			// �ε������� ��ȯ�Ͽ� list.size-1����ŭ for�� �ݺ�
			// size-1 �ϴ� ���� : i���� �ε��������� ����ϱ� ������ 
			// �ݺ��� ���� �����ϴ� i��(list.size() = 10 / �ε��� ������ 0~9)�� �ε��� ������ �Ѿ�� �ʱ����� -1�� ���ش�.
			for(int i = 0;i < list.size()-1; i++) {
			
				// ���� ���ڸ� index i������ ���
				int checkNum0 = list.get(i);
				
				// ������ ���ڸ� index i+1������ ���
				int checkNum1 = list.get(i+1);
				
				// ���ǽ��� ���� checkNum0 �� checkNum1 �� �� �� ��ġ�� ��������
				// checkNum0 �� checkNum1 ���� ū ���
				 if(checkNum0 > checkNum1) {
					// checkNum1 ���� �Ҹ����� �ʵ��� ������ ��������
					int savecheckNum1 = checkNum1;
					
					// set�� ���� i+1 ���� checkNum0 ���� set ����
					list.set(i+1, checkNum0);
					// i������ ������ �����ص� checkNum1 ���� �־���
					list.set(i, savecheckNum1);	
				}
			}
		}
		System.out.println(list);
	}
}
