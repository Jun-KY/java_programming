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
			System.out.print("�Է��Ͻÿ�: ");
			Alp[i] = sc.next();
			count++;
			System.out.print("========" + count + "========\n");
		}
		
		System.out.print("ù��°: " + Alp[0] + "| �� ��°: " + Alp[3] + "| �ϰ� ��°: " + Alp[6]);
		
	}
}
