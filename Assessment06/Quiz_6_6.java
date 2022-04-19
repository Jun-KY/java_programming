package Assessment06;

import java.util.Scanner;

public class Quiz_6_6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int min;
		int num = 0;
		int count = 1;
		System.out.println("1000미만 정수를 출력하시오");
		for(int i = 0; i<arr.length; i++) {
			System.out.print("<"+ count+"> : ");
			num = sc.nextInt();
			if (num < 1000) {
				arr[i] = num;
				count++;
			}
			else {
				i--;
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		System.out.print("Minimum Number: " + min);
	}
}
