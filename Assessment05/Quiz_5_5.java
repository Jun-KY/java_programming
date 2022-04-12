package Assessment05;

import java.util.Scanner;

public class Quiz_5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Row: ");
		int row = sc.nextInt ();
		
		for (int i = row; i > 0; i--) {
			for (int j = 0; j < row - i ; j++) {
				System.out.print(" ");
			}
			for (int k = i * 2; k > 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
