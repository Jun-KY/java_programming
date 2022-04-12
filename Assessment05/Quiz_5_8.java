package Assessment05;

import java.util.Scanner;

public class Quiz_5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÚ¿¬¼ö Row: ");
		int num = sc.nextInt();
		int n = 1;
		
		for (int i = 0 ; i < num ; i ++) {
			for (int j = 0; j < i; j ++) {
				System.out.print("  ");
			}
			for (int k = 0; k < num-i; k++) {
				
				System.out.print(n++ + " ");

			}
			System.out.println();
		}

		
		
	}
}
