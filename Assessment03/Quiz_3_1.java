package Assessment03;

import java.util.Scanner;

// ������ �Է¹޾� 0 �̸� "zero" ����̸� "plus" �����̸� "minus" ��� ���.
public class Quiz_3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
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
