package Assessment02;
import java.util.Scanner;

// 인수와 가영이의 키와 몸무게를 입력받아 민수가 둘다 크면 1 아니면 0을 출력하라
public class Quiz_2_4 {
	private static Scanner sc;
	
	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		System.out.print("h1=");
		int h1 = sc.nextInt();
		System.out.print("w1=");
		int w1 = sc.nextInt();
		System.out.print("h2=");
		int h2 = sc.nextInt();
		System.out.print("w2=");
		int w2 = sc.nextInt();
		
		if (h1 > h2 && w1 > w2){
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		

	}
}
