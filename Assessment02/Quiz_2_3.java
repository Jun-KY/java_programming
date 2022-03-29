package Assessment02;
import java.util.Scanner;

public class Quiz_2_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		int nextx, nexty, mul;
		nextx = x++;
		nexty = --y;
		mul = nextx * nexty;
		
		System.out.printf("x = %d\ny = %d\nmul = %d", x, y, mul);
	}
}
