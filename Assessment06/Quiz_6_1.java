package Assessment06;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<String> Alp = new ArrayList<>();
		String[] Alp = new String [10];
		int count = 0;
		
		for (int i = 0; i<Alp.length; i++) {
			System.out.print("입력하시오: ");
			Alp[i] = sc.next();
			count++;
			System.out.print("========" + count + "========\n");
		}
		
		System.out.print("첫번째: " + Alp[0] + "| 네 번째: " + Alp[3] + "| 일곱 번째: " + Alp[6]);
		
	}
}
