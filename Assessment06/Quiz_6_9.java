package Assessment06;

import java.util.Scanner;

public class Quiz_6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] play = new int [4][3];
		int[][] sum = new int [4][1];
		for(int i = 0; i<4; i++) {
			System.out.print((i+1)+"Class? : ");
			for(int j = 0; j<3; j++) {
				play[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i <4; i++) {
			for(int j = 0; j<3; j++) {
				sum[i][0] += play[i][j];
			}
			System.out.println((i+1)+"Class? : "+sum[i][0]);
		}

	}
}
