package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int count = 0;
		System.out.print("(0�� �ԷµǸ� ����) ������ �Է��Ͻÿ�: ");
		while (true) {
			
			num = sc.nextInt();
			if(num != 0) {
				if(num % 3 ==0) { 
					continue;
				}
				else if(num % 5 == 0) {
					continue;
				}
				else
					count++;
			}
			else
				break;
		}
		System.out.print("3�Ǵ� 5�� ����� ������ ���� ������: ");
		System.out.println(count+"��");
	}
}
