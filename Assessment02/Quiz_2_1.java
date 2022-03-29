package Assessment02;
import java.util.Scanner;

public class Quiz_2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		
		System.out.printf("%d > %d --- " + (x > y) + "\n", x, y);
		System.out.printf("%d < %d --- "+ (x < y), x, y);
		System.out.println();
		System.out.printf("%d >= %d --- "+ (x >= y), x, y);
		System.out.println();
		System.out.printf("%d <= %d --- "+ (x <= y), x, y);
		
		sc.close();
	}
}
