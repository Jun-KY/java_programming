package Assessment04;

import java.util.Scanner;

public class Quiz_4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int count = 0;
		System.out.println("0�� �Է��ϸ� ����˴ϴ�.");
		while (num != 0) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
			if(num %3 == 0) {
			}
			else if(num % 5 == 0) {
			}
			else {
				count++;
			}
		}
		System.out.println("3�Ǵ� 5�� ����� ������ ���� " + count+"��");
		sc.close();
	}
}
