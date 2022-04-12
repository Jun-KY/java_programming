package Assessment03;

import java.util.Scanner;

// 1~12 사이의 정수를 입력 받아 평년의 경우 입력 받은 월의 날 수를 출력.

public class Quiz_3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하시오: ");
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
		System.out.println(month + "월의 일 수는 " + day + "일");
	}
}
