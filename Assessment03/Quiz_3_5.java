package Assessment03;

import java.util.Scanner;

// ���ڴ� 'M', ���ڴ� 'F'�� ��Ÿ���� 18���̻��� �����̶�� �Ѵ�.
// ���� ('M', 'F')�� ���̸� �Է¹޾� 
// "MAN" (���γ���) "WOMAN" (���ο���) "BOY"(�̼��Ⳳ��) "GIRL" (�̼��⿩��)
public class Quiz_3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i = 0;
		String def = "";
		String gen = "";
		int age = 0;
		//while (i < 5) {
			System.out.print("����: ");
			gen = sc.nextLine();
			System.out.print("����: ");
			age = sc.nextInt();

			switch (gen) {
			case "F": 
				if (age > 0) {
					if (age >= 18) {
						def = "WOMAN";
					}
					else {
						def = "GIRL";
					}
				}
				else {
					System.out.println("���̰� �߸��Ǿ����ϴ�.");
				}
				break;
			case "M":
				if (age > 0) {
					if (age >= 18) {
						def = "MAN";
					}
					else {
						def = "BOY";
					}
				}
				else {
					System.out.println("���̰� �߸��Ǿ����ϴ�.");
				}
				break;
			default:
				System.out.println("������ �ٽ� �Է��ϼ���");
				break;
			}
			System.out.println(def);
		//}
		sc.close();
	}
}
