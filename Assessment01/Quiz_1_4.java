package Assessment01;
import java.util.Scanner;

public class Quiz_1_4 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("c = ");
		int c = sc.nextInt();
		int sum = a + b + c;
		int avg= sum / 3;
		System.out.printf("a: %d\nb: %d\nc: %d\nsum: %d\navg: %d", a, b, c, sum, avg);
		
	}
}
