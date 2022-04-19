package Assessment06;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_6_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> score = new ArrayList<>();
		double sum=0.0;
		int classNum = 0;
		score.add(85.6);score.add(79.5);score.add(83.1);
		score.add(80.0);score.add(78.2);score.add(75.0);
		
		for (int i = 0; i<2; i++) {
			System.out.print("반을 입력하시오: ");
			classNum = sc.nextInt()-1;
			sum += score.get(classNum);
		}
		System.out.print(sum);
		
	}
}
