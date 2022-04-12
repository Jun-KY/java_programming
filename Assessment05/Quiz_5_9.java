package Assessment05;

import java.util.Scanner;

public class Quiz_5_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		int [] odd = new int[5];
		for (int i = 0; i < odd.length; i++) {
//			System.out.println(odd[i]);
			odd[i] = i*2+1;
		}
		int [][] arr;
		System.out.print("자연수 n: ");
		while(true) {
			int n = sc.nextInt();
			if (n < 1)
				continue;
			arr = new int [n][n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = odd[j];
				}
//				arr[i] = 
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
			}
		}
*/
		
		System.out.print("자연수 n: ");
		
		while(true) {
			
			int n = sc.nextInt();
			if (n < 1)
				continue;
			int num = 1;
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j < n; j++) {
					System.out.print(num+" ");
					num += 2;
					if (num > 10)
						num = 1;
				}
				
				System.out.println();
				
			}
			
			
			
			
			
		}
	}
}
