package Assessment03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//가위, 바위, 보 게임을 작성하여 보자. 텍스트 버전은 여기서 작성하고
// 하나를 선택하면 이것을 컴퓨터가 생성한 난수값과 비교한다.
public class RockPaperScissors_InclassQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		ArrayList<String> list = new ArrayList<>();
		list.add("가위");list.add("바위");list.add("보");

		//int num = sc.nextInt();
		int num , com, count = 0;
		String res = " ";
		while(true) {
			System.out.println("0을 누르면 종료.");
			System.out.print("가위(1) 바위(2) 보(3): ");
			num = sc.nextInt()-1;
			System.out.println();
			if (num == -1)
				break;
			if (num >= 3 || num < 0) {
				System.out.println("다시입력하시오\n");
				continue;
			}
			com = rand.nextInt(3);
			System.out.print("나: " + list.get(num) + " 컴퓨터: ");
			System.out.println(list.get(com));
			if (num == com)
				res = "--<비겼습니다.>--";
			if (num == 0) {

				if (com == 1)
					res = "--<졌습니다.>--";
				else if (com == 2)
					res = "--<이겼습니다.>--";
			}
			else if (num == 1) {
				if (com == 0)
					res = "--<이겼습니다.>--";
				else if (com == 2)
					res = "--<졌습니다.>--";
			}
			else if (num == 2) {
				if (com == 0)
					res = "--<졌습니다.>--";
				else if (com == 1)
					res = "--<이겼습니다.>--";
			}
			System.out.println(res);
			System.out.println();
		}
//		switch (num) {
//		case (0):
			
//		}
	}
}
