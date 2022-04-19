package Assessment06;

import java.util.Scanner;

public class Quiz_6_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
//		int[] arr = new int[10];	//test//
		int count = 0;
		System.out.print("정수를 입력하시오: ");
		System.out.println("(최대 100개)");
		int num = 1;
		
//		do {
//			System.out.print("<"+ count+"> : ");
//			arr[num] = sc.nextInt();
//			count++;
//			num++;
//			
//		}while(arr[num] != 0 && num<100);
		
		
		for (int j = 0; j<arr.length; j++) {
			count++;
			System.out.print("<"+ count+"> : ");
			num = sc.nextInt();
			
			if (num != 0){
				arr[j] = num;
			}
			else 
				break;

//			System.out.println(arr[j]);
//			System.out.println(count);
		}
//		System.out.println(count);

		for (int j = count-2; j >= 0; j--) {
		System.out.print(arr[j]+ " ");
		}
	}
}
