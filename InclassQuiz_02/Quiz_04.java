package InclassQuiz_02;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stCount = 1;
		int score, grade = 1;
		int[] arr = new int [10];
		
		System.out.println("�л� 15���� ������ �Է� ");
		for(int i = 0; i<15; i++) {
			System.out.print("Student<"+stCount+">: ");
			score = sc.nextInt();
			grade = (score/10);
//			System.out.println(grade); //debug//
			for(int j = 0; j<arr.length; j++) {
				if(grade == j)
					arr[j]++;
			}
			stCount++;
		}
		for(int i = 0; i<10; i++) {
			System.out.println((i*10)+"~"+(i*10+10)+"\t: "+arr[i]);
		}

	}
}
