package Assessment05;

import java.util.Scanner;

public class Quiz_5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
//		for (int i = 1; sum < num; i = i+2) {
//			sum += i;
//			count++;
//			
//		}
//		for (int i = 1; sum < num; i++) {
//			if (i % 2 == 0)
//				continue;
//			sum += i;
//			count ++;
//		}
		for (int i = 1; i < num; i = i+2) {
			if (sum >= num)
				break;
			sum += i;
			count ++;
		}
		System.out.println("count: " + count + " Sum: " + sum);
		
		
		sc.close();
	}
	
}
