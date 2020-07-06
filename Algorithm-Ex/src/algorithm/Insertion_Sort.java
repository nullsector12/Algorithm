package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Sort {
	
	/*
	 * 2020. 07. 06 �ۼ�
	 * �˰��� ���� ����
	 * Title : Insertion Sort
	 * Goal	:	1. Selection sort �� ���� ���� 
	 * 			2. Selection sort ������ ���� ����
	 * 			3. Selection sort ����
	 * 
	 * ���� : ������ 2��° index�� ���� temp�� ���� -> temp�� ���� ���ҵ��� ���ϸ� ���� -> '1'������ ���ư� ���� index�� ���� temp�� ����, �ݺ�
	 * 
	 * review :
	 * 
	 * 		1. �ѹ� �̾Ƽ� �ӽ������� ���� �ڸ��� �����ϰ� ���� �ٲٸ� �ȵǴµ� ���� Sort���� �����ϴ��� �� ���� �����Ͽ� �ݺ������� ������ ����.
	 * 		2. ��ŭ �ݺ��ؾ� �� �� �𸣴µ� �տ��� ��� ��� for���� ������. �Ѱ��� ����̳� ������ �ƴ� �پ��� ���ٹ��� ����غ���.
	 * 		3. ������ list ���� sort �����ϴ�.
	 * 		4. ���ڵ� �� IDE�� �Ű� �����غ��� ����� �ٸ� ������ ���� �ذ� �� �ٽ� ���ڵ����� �ϳ��ϳ� Ȯ���غ���.
	 * 
	 * */
	
	public static void main(String[] args) {
		
			int[] arr = new int[10];
			
			for(int i = 0; i < arr.length-1; i++ ) {
				int randNum = (int) (Math.random()*100) + 1;
				arr[i] = randNum;
			}
			System.out.println(Arrays.toString(arr));
			
			
			
			// ù��° �ε��� �տ��� �ƹ� ���� ���⶧���� �ι�° �ε������� Ž�� ����
			for(int i = 1; i < arr.length; i++) {
				int temp = arr[i]; // �ι�° �ε��� ���� temp�� �ӽ�����
				int prev = i-1; // temp�� ������ �ε��� �� ����
				while( (prev >= 0) && (arr[prev] > temp) ) { // ������ �ε����� 0�� ���� �ʰ�, �������� temp������ ũ��
					arr[prev+1] = arr[prev]; // ������ �ٷ� ���ڸ�(temp �ڸ�)�� ���� �ڸ���(prev �ڸ�)���� �����ϰ�
					prev--; // �������� �� ���� ��ġ�� �̵��Ѵ�.(������ �Ǹ� �ڵ����� while�� ����)
				}
				arr[prev + 1] = temp; 
				// prev�� ������ �ǰų� temp���� ���������� ū ��� while������ ������
				// �ڵ����� prev���� ���� temp������ ���� ���� �߿��� ���� ū ���� ��ġ�� ����Ŵ
				// ������ �ٷ� �տ� ���� temp���� �������ش�.
		}
		System.out.println(Arrays.toString(arr));
	}
}	

