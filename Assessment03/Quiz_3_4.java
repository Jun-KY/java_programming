package Assessment03;

import java.util.Scanner;

// 1~12 ������ ������ �Է� �޾� ����� ��� �Է� ���� ���� �� ���� ���.

public class Quiz_3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month){
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			day = 31;
			break;
		case (4):
		case (6):
		case (9):
		case (11):
			day = 30;
			break;
		default:
			day = 28;
			break;
		}
		System.out.println(month + "���� �� ���� " + day + "��");
	}
}