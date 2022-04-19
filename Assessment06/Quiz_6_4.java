package Assessment06;

import java.util.Scanner;

public class Quiz_6_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		int count = 1;
		int sum_odd = 0, sum_even = 0;
		double avg_odd = 0, avg_even = 0;
		
		System.out.println("정수 10개를 입력하시오: ");
		for (int i = 0; i<numbers.length; i++) {
			System.out.println("=====" + count + "번째=====");
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
		System.out.println("짝수 번째 입력된 값의 합: "+ sum_even);
		System.out.println("홀수 번째 입력된 값의 평균: "+ avg_odd);
	}
}
