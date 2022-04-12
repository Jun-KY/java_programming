package Assessment05;

import java.util.Scanner;

public class Quiz_5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100까지의 정수를 입력하시오: ");
		int num = sc.nextInt();
		int mul = 1;
//		for (int i = 1; i < 100; i++) {
//			mul = num * i;
//			System.out.print(mul + " ");
//			if (mul % 10 == 0)
//				break;
//		}
		int i = 1;
		while(true) {
			mul = num * i;
			if (mul > 100) 
				break;
			System.out.print(mul + " ");
			if (mul % 10 == 0)
				break;
			i++;
		}
	}
}
