package Assessment05;

import java.util.Scanner;

public class Quiz_5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("За: " );
		int row = sc.nextInt();
		System.out.print("ї­: ");
		int column = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
