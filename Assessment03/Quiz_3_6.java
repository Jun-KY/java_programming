package Assessment03;
// �⵵�� �Է� �޾� ����(leap year) ���� ���(common year)���� �Ǵ��϶�

import java.util.Scanner;

public class Quiz_3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Year? : ");
		int year = sc.nextInt();
		String what_year= " ";
		if(year % 4 == 0 && year % 100 !=0) {
			what_year = "leap year";
		}
		else if (year % 400 == 0) {
			what_year = "leap year";
		}
		else {
			what_year = "common year";
		}
		System.out.println(year + " is " + what_year);
		
		sc.close();
	}
}
