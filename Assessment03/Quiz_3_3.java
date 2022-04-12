package Assessment03;

import java.util.Scanner;

// 1번은 개, 2번은 고양이, 3번은 병아리
// 입력된 번호에 해당하는 동물을 영어로 출력하는 프로그램
// 없으면 "I don't know."
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
