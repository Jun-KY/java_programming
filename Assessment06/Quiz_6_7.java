package Assessment06;

//import java.util.ArrayList;
import java.util.Scanner;
//public class Tens{
//	
//}
public class Quiz_6_7 {

	public static void main(String[] args) {
//		ArrayList<Double> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int num = 1;
		int tens = 0;
		int numbers[] = new int[1000];;
		int arr[] = new int[numbers.length];
		System.out.println("0�� �Է��ϸ� ���� ");
		System.out.println("100�̸� �ڿ���)");
		for(int i=0; i<numbers.length; i++) {
			System.out.print("<"+count+"> : ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			else if (num > 0 && num<100) {
				tens = num/10;
				numbers[tens] = tens;
				count++;
				arr[tens]++;
			}
			else {
				i--;
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}

		}
		for(tens = 0; tens < 10; tens++) {
			if(arr[tens]!=0)
				System.out.println(tens + " : " +arr[tens]);
		}

	}
}
