package Assessment02;
import java.util.Scanner;

// 3개의 정수를 입력 받아 첫 번째 수가 가장크면 1 아니면 0을 출력하고 세 개의 수가 모두
// 같으면 1 아니면 0을 출력하라
public class Quiz_2_2 {
	
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();	
		System.out.print("z = ");
		int z = sc.nextInt();
		
		if ((x > y && x > z))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);	
		}
		if (x == y && y == z){
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}
}
