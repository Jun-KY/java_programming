package Assessment04;

import java.util.Scanner;

public class Quiz_4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int count = 0;
		System.out.println("0을 입력하면 종료됩니다.");
		while (num != 0) {
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			if(num %3 == 0) {
			}
			else if(num % 5 == 0) {
			}
			else {
				count++;
			}
		}
		System.out.println("3또는 5의 배수를 제외한 수는 " + count+"개");
		sc.close();
	}
}
