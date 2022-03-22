import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		int avg= sum / 3;
		System.out.printf("a: %d\nb: %d\nc: %d\nsum: %d\navg: %d", a, b, c, sum, avg);
	}
}
