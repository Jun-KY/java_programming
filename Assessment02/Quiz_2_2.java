package Assessment02;
import java.util.Scanner;

// 3���� ������ �Է� �޾� ù ��° ���� ����ũ�� 1 �ƴϸ� 0�� ����ϰ� �� ���� ���� ���
// ������ 1 �ƴϸ� 0�� ����϶�
public class Quiz_2_2 {
	
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();	
		System.out.print("z = ");
		int z = sc.nextInt();
		
		if ((x > y && x > z))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);	
		}
		if (x == y && y == z){
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}
}
