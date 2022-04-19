package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n1, n2;
		double avg = 0;
		
		System.out.println("두 정수를 입력하시오");
		System.out.print("Number 1: ");
		n1 = sc.nextInt();
		System.out.print("Number 2: ");
		n2 = sc.nextInt();
		if (n1<=n2) {
			for (int i = n1; i<=n2; i++) {
				sum +=i;
			}
			avg = (double)sum /(n2-n1+1);
		}
		else {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}
			avg = (double)sum /(n1-n2+1);
		}
		System.out.print("Sum: "+sum+"\navg: "+avg);
		
		
	}
}
