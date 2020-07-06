package algorithm;

import java.util.ArrayList;

public class Selection_Sort {
	
	/*
	 * 2020. 07. 02 �ۼ�
	 * �˰��� ���� ����
	 * Title : Selection sort
	 * Goal	:	1. Selection sort �� ���� ���� 
	 * 			2. Selection sort ������ ���� ����
	 * 			3. Selection sort ����
	 * 
	 * ���� : �־��� �迭���� �ּҰ� ã�� -> �ش� �ּҰ��� �� �տ� ��ġ�� ���� ��ü-> �� ó�� ��ġ�� �� ������ ��ġ���� �ݺ�
	 * */
	
	public static void main(String[] args) {
		

		ArrayList <Integer> list = new ArrayList<Integer>();
		

		for (int i = 0; i < 10; i++) {
			int randNum = (int)(Math.random()*100)+1;
			list.add(randNum);
		}

		System.out.println(list);
		
		// �ּҰ� Index��ȣ�� ������ ���� ������ ���� ����
		int minIndex, change;
		
		// list ������ �ּҰ� �� �ݺ��� ���� for��
		// list.size()-1 �ϴ� ���� : ������ �ݺ��� size�� 10�� -1��°���� �������� �ϱ� ����
		// size = 10�� �� �ε��� ��ȣ�� 0 ~ 9
		for (int i = 0; i < list.size()-1; i++) {
			
			// list ���� �ּҰ��� ������ Index ����
			minIndex = i;
			
			// list ���� ����� ���ϱ� ���� for �ݺ���
			for(int j = i+1; j < list.size(); j++) {
				// i+1�� �ε����� ���� i�� �ε��� ������ ������
				 if(list.get(j) < list.get(minIndex)) {   
					 // �ּҰ� Index ��ȣ�� j�� ����
					 minIndex = j;
					 
					// list[1] < list [0] =  minIndex -> [1]
				}
			}
			// �ڸ� ������ ���� change ��  minIndex�� �� ���� 
			// change = list[1]
			change = list.get(minIndex);
			
			// list�� minIndex=j�� �ε����� i�� �ε����� �� ����
			// list[1] = list[0]
			list.set(minIndex, list.get(i)) ;
		
			// list�� i�� �ε����� minIndex=j�� �ε����� �� ����
			// list[0] = list[1]
			list.set(i, change);
		}
		System.out.println(list);
	}
}
