package Assessment04;

import java.util.Scanner;

public class Quiz_4_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.print("100 ������ ������ �Է��Ͻÿ�");
		num = sc.nextInt();
		if (num >= 0 && num <= 100) {

			while (num <= 100) {

				sum += num;
				num++;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}

		sc.close();
	}
}
