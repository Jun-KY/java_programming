package Assessment04;

import java.util.Scanner;

public class Quiz_4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("�ڿ����� �Է��Ͻÿ�: ");

		int num = sc.nextInt();
		if (num > 0) {
			int res = 0;
			for (int i = 1; i < 11; i++){
				res = num * i;
				System.out.print(res + " ");
			}
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	}
}
