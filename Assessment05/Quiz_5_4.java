package Assessment05;

import java.util.Scanner;

public class Quiz_5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��: ");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		
		
		sc.close();
	}
}
