package Assessment03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//����, ����, �� ������ �ۼ��Ͽ� ����. �ؽ�Ʈ ������ ���⼭ �ۼ��ϰ�
// �ϳ��� �����ϸ� �̰��� ��ǻ�Ͱ� ������ �������� ���Ѵ�.
public class RockPaperScissors_InclassQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		ArrayList<String> list = new ArrayList<>();
		list.add("����");list.add("����");list.add("��");

		//int num = sc.nextInt();
		int num , com, count = 0;
		String res = " ";
		while(true) {
			System.out.println("0�� ������ ����.");
			System.out.print("����(1) ����(2) ��(3): ");
			num = sc.nextInt()-1;
			System.out.println();
			if (num == -1)
				break;
			if (num >= 3 || num < 0) {
				System.out.println("�ٽ��Է��Ͻÿ�\n");
				continue;
			}
			com = rand.nextInt(3);
			System.out.print("��: " + list.get(num) + " ��ǻ��: ");
			System.out.println(list.get(com));
			if (num == com)
				res = "--<�����ϴ�.>--";
			if (num == 0) {

				if (com == 1)
					res = "--<�����ϴ�.>--";
				else if (com == 2)
					res = "--<�̰���ϴ�.>--";
			}
			else if (num == 1) {
				if (com == 0)
					res = "--<�̰���ϴ�.>--";
				else if (com == 2)
					res = "--<�����ϴ�.>--";
			}
			else if (num == 2) {
				if (com == 0)
					res = "--<�����ϴ�.>--";
				else if (com == 1)
					res = "--<�̰���ϴ�.>--";
			}
			System.out.println(res);
			System.out.println();
		}
//		switch (num) {
//		case (0):
			
//		}
	}
}
