package Assessment03;

import java.util.Scanner;

// 1���� ��, 2���� �����, 3���� ���Ƹ�
// �Էµ� ��ȣ�� �ش��ϴ� ������ ����� ����ϴ� ���α׷�
// ������ "I don't know."
public class Quiz_3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int num = sc.nextInt();
		String animal = " ";
		switch (num) {
			case(1): 
				animal = "dog";
				break;
			case(2):
				animal = "cat";
				break;
			case(3):
				animal = "chick";
				break;
			default:
				animal = "I don't know";
				break;
		}
		System.out.println(animal + "");
	
	}
}
