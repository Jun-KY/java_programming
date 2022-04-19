package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(0누르면 종료) 1부터 100까지 정수 중 한 개를 입력하시오 ");
		System.out.println("100보다 작은 배수들을 출력하다 10의 배수가 출력되면 종료됨");

		while(true) {
			int mul = 1;
			System.out.print("Number: ");
			int num = sc.nextInt();
			if(num>0 && num<=100) {
				for (int i = 1; i < 100; i++) {
					mul = num*i;
					if (mul>100)
						break;
					System.out.print(mul + " ");
					if (mul%10==0)
						break;
				}
				System.out.println();
			}
			else if (num == 0)
				break;
			else {
				System.out.println("범위를 벗어났습니다.");
			}
		}
					
		
		
	}
}
