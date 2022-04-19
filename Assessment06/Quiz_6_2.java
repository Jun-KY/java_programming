package Assessment06;

import java.util.Scanner;

public class Quiz_6_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] weight = new double[6];
		int count = 0;
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i<weight.length; i++) {
			System.out.print("¸ö¹«°Ô¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
			weight[i] = sc.nextDouble();
			count ++;
			sum += weight[i];
			System.out.printf("------%d------\n\n",count);
		}
		avg = sum / count;
		System.out.print("Æò±Õ ¸ö¹«°Ô: " + Math.round(avg*10)/10.0);
	}
}
