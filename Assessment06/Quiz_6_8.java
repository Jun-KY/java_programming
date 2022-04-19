package Assessment06;

import java.util.Scanner;

public class Quiz_6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr_1 = new int[2][4];
		int[][]arr_2 = new int[2][4];
		int[][]mul = new int[2][4];
		System.out.println("First Array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((i+1) + " | " + (j+1) + " : ");
				arr_1[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Second Array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((i+1) + " | " + (j+1) + " : ");
				arr_2[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Multiplied Array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				mul[i][j] = arr_1[i][j]*arr_2[i][j]; 
				System.out.print(mul[i][j]+" "); 
			}
			System.out.println();
		}
	}
}
