package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(0������ ����) 1���� 100���� ���� �� �� ���� �Է��Ͻÿ� ");
		System.out.println("100���� ���� ������� ����ϴ� 10�� ����� ��µǸ� �����");

		while(true) {
			int mul = 1;
			System.out.print("Number: ");
			int num = sc.nextInt();
			if(num>0 && num<=100) {
				for (int i = 1; i < 100; i++) {
					mul = num*i;
					if (mul>100)
						break;
					System.out.print(mul + " ");
					if (mul%10==0)
						break;
				}
				System.out.println();
			}
			else if (num == 0)
				break;
			else {
				System.out.println("������ ������ϴ�.");
			}
		}
					
		
		
	}
}
