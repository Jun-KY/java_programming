package Assessment03;

import java.util.Scanner;

// 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력.
public class Quiz_3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("zero");
		}
		else if(num > 0) {
			System.out.println("plus");
		}
		else if(num < 0) {
			System.out.println("minus");
		}
		
	}
}
