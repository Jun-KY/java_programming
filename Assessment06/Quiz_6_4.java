package Assessment06;

import java.util.Scanner;

public class Quiz_6_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		int count = 1;
		int sum_odd = 0, sum_even = 0;
		double avg_odd = 0, avg_even = 0;
		
		System.out.println("���� 10���� �Է��Ͻÿ�: ");
		for (int i = 0; i<numbers.length; i++) {
			System.out.println("=====" + count + "��°=====");
			numbers[i] = sc.nextInt();
			if (count % 2 == 1) {
				sum_odd += numbers[i];
			}
			else {
				sum_even += numbers[i];
			}
			count++;
		}
		avg_odd = (double)sum_odd/5;
		avg_odd = Math.round(avg_odd*10)/10.0;
		avg_even = (double)sum_even/5;
		avg_even = Math.round(avg_even*10)/10.0;
		System.out.println("¦�� ��° �Էµ� ���� ��: "+ sum_even);
		System.out.println("Ȧ�� ��° �Էµ� ���� ���: "+ avg_odd);
	}
}
