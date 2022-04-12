package Assessment01;
import java.util.Scanner;

public class Quiz_1_5 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Yard?");
		double yard = sc.nextDouble();
		double cm;
		cm = yard * 91.44;
		System.out.printf("%.1fyard = %.1fcm", yard, cm);
		
	}
}
