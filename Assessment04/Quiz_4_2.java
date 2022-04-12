package Assessment04;

import java.util.Scanner;

public class Quiz_4_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.print("100 이하의 정수를 입력하시오");
		num = sc.nextInt();
		if (num >= 0 && num <= 100) {

			while (num <= 100) {

				sum += num;
				num++;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}

		sc.close();
	}
}
