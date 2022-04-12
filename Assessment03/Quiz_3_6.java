package Assessment03;
// 년도를 입력 받아 윤년(leap year) 인지 평년(common year)인지 판단하라

import java.util.Scanner;

public class Quiz_3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Year? : ");
		int year = sc.nextInt();
		String what_year= " ";
		if(year % 4 == 0 && year % 100 !=0) {
			what_year = "leap year";
		}
		else if (year % 400 == 0) {
			what_year = "leap year";
		}
		else {
			what_year = "common year";
		}
		System.out.println(year + " is " + what_year);
		
		sc.close();
	}
}
