package Assessment04;

import java.util.Scanner;

public class Quiz_4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int i = 1;
		int sum = 0;
		int num;


		System.out.print("100 이하 양의 정수만 입력하시오: ");
		num = sc.nextInt();
		if (num > 0 && num <= 100) {

			while (i <= num) {

				sum += i;
				i++;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}

	}
}
