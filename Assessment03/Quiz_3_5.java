package Assessment03;

import java.util.Scanner;

// 남자는 'M', 여자는 'F'로 나타내고 18세이상을 성인이라고 한다.
// 성별 ('M', 'F')과 나이를 입력받아 
// "MAN" (성인남자) "WOMAN" (성인여자) "BOY"(미성년남자) "GIRL" (미성년여자)
public class Quiz_3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i = 0;
		String def = "";
		String gen = "";
		int age = 0;
		//while (i < 5) {
			System.out.print("성별: ");
			gen = sc.nextLine();
			System.out.print("나이: ");
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
					System.out.println("나이가 잘못되었습니다.");
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
					System.out.println("나이가 잘못되었습니다.");
				}
				break;
			default:
				System.out.println("성별을 다시 입력하세요");
				break;
			}
			System.out.println(def);
		//}
		sc.close();
	}
}
