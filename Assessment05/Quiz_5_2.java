package Assessment05;

import java.util.Scanner;

public class Quiz_5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num_1 = sc.nextInt();
		System.out.print("NUmber 2: ");
		int num_2 = sc.nextInt();
		
		for (int j = 1; j < 10; j++) {
			for (int i = num_1 ; i >= num_2; i--) {
				System.out.printf("%d X %d = %d   ", i, j, i*j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
