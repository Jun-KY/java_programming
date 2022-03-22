import java.util.Scanner;

public class Quiz_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yard?");
		double yard = sc.nextDouble();
		double cm;
		cm = yard * 91.44;
		System.out.printf("%.1fyard = %.1fcm", yard, cm);
		
	}
}
