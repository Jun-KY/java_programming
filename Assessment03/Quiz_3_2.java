package Assessment03;

import java.util.Scanner;
// ���� �빮�� �Է¹޾� 
// A - Excellent
// B - Good
// C - Usually
// D - Effort
// F - Failure
// �� �� �����̸� error ���
public class Quiz_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		String ans = " ";
		switch (ch) {
			case ("A"):
				ans = "Excellent";
				break;
			case ("B"):
				ans = "Good";
				break;
			case ("C"):
				ans = "Usually";
				break;
			case ("D"):
				ans = "Effort";
				break;
			case ("F"):
				ans = "Failure";
				break;
			default:
				ans = "error";
				break;
		}
		System.out.println("" + ans);
		
		sc.close();
	}
}
