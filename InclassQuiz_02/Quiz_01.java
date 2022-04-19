package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int count = 0;
		System.out.print("(0이 입력되면 종료) 정수를 입력하시오: ");
		while (true) {
			
			num = sc.nextInt();
			if(num != 0) {
				if(num % 3 ==0) { 
					continue;
				}
				else if(num % 5 == 0) {
					continue;
				}
				else
					count++;
			}
			else
				break;
		}
		System.out.print("3또는 5의 배수를 제외한 수의 개수는: ");
		System.out.println(count+"개");
	}
}
