package Assessment04;

import java.util.Scanner;

public class Quiz_4_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base;
		double height;
		double width;
		String con = " ";
		char cont = ' ';
		do {
			System.out.print("base? ");
			base = sc.nextDouble();
			System.out.print("height? ");
			height = sc.nextDouble();
			
			width = base*height/2;
			System.out.printf("Triangle width: %.1f\n" , width);
			
			System.out.print("Continue? ");
			con = sc.next();
			cont = con.charAt(0);
//			System.out.println(con);
		} while(cont == 'y' || cont == 'Y');
		System.out.println("종료합니다.");
//		while(true) {
//			System.out.print("base? ");
//			base = sc.nextDouble();
//			System.out.print("height? ");
//			height = sc.nextDouble();
//			
//			width = base * height / 2;
//			System.out.printf("Triangle width: %.1f\n", width);
//			
//			System.out.print("Continue? ");
//			con = sc.nextLine();
//			if(con != "y" || con != "Y") 
//				break;
//			
//		}
		
		sc.close();
	}
}
