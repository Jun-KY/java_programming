package Assessment02;
import java.util.Scanner;

// �μ��� �������� Ű�� �����Ը� �Է¹޾� �μ��� �Ѵ� ũ�� 1 �ƴϸ� 0�� ����϶�
public class Quiz_2_4 {
	private static Scanner sc;
	
	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		System.out.print("h1=");
		int h1 = sc.nextInt();
		System.out.print("w1=");
		int w1 = sc.nextInt();
		System.out.print("h2=");
		int h2 = sc.nextInt();
		System.out.print("w2=");
		int w2 = sc.nextInt();
		
		if (h1 > h2 && w1 > w2){
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		

	}
}
