package Assessment05;

import java.util.Scanner;

public class Quiz_5_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÚ¿¬¼ö Row: ");
		int row = sc.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = row - i; j > 1; j--) {
				System.out.print("  ");
			}
			for (int k = 1 ; k <= i + 1; k ++ ) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
