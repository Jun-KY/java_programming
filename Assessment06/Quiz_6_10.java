package Assessment06;

import java.util.Scanner;

public class Quiz_6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [4][2];
		int[][] avg = new int [3][4];
		int sum = 0, count = 1;
		int avg_sum = 0;
		int all_sum = 0;

		System.out.println("4행 2열의 정수 배열: ");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(count+"| ");
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				all_sum += arr[i][j];
			}
			count++;
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			sum = 0;
			for(int j = 0; j < arr[i].length; j ++) {
				sum += arr[i][j];
			}
			System.out.print(sum/2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i<arr[i].length; i++) {
			sum = 0;
			for(int j= 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.print(sum/4 + " ");
		}
		System.out.println();
		
//		for(int i = 0; i< 3; i++) {
//			for(int j = 0; j<4; j ++) {
//				//				avg[i][j] = 
//			}
//		}
//		System.out.println();
		System.out.println(all_sum/8);
	}
}
