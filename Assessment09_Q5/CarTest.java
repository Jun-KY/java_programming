package Assessment09_Q5;

import java.util.HashMap;
import java.util.Scanner;

public class CarTest {
//	HashMap map = new HashMap();
	// 1���� �����͸� ������� 4���� Car ��ü�� ���� �Ͽ� HashMap�� �ִ´�
	// HashMap�� ���� �� Ű ���� 1,2,3,4���·� �� Car �̸��� �޺κ��� �������� �Ѵ�
	// ��� Car��ü�� �⺻ ������ ��� �Ѵ�(for���� �̿��Ͽ� ��� �Ѵ�)
	// ��� Car ��ü�� 30�� ������ �ϰ� �ٽ� HashMap�� �ִ´�
	// ��� ��ü�� ������ ��� �Ѵ�(for���� �̿��Ͽ� ��� �Ѵ�)
	// ��� Car ��ü�� 20�� ���� �ϰ� �ٽ� HashMap�� �ִ´�
	// ��� ��ü�� ������ ��� �Ѵ�(for���� �̿��Ͽ� ��� �Ѵ�)
	public static void main(String[] args) {
//		HashMap map = new HashMap();
		// 1���� �����͸� ������� 4���� Car ��ü�� ���� �Ͽ� HashMap�� �ִ´�
		// HashMap�� ���� �� Ű ���� 1,2,3,4���·�  �� Car �̸��� �޺κ��� ���������Ѵ�.
		// ��� car ��ü�� �⺻ ������ ����Ѵ�.(for ���� �̿��Ͽ� ���)
		HashMap<String, Object> map = new HashMap<String, Object>();
		Scanner sc = new Scanner(System.in);
		
//		L1, Shovy, 1500, 50, 20, 0
		L1 car1 = new L1();		
		car1.setName("Shovy");
		car1.setEngineSize("1500");
		car1.setOilTank(50);
		car1.setOilSize(20);
		car1.setDistance(0);
		map.put("1", car1);
//		L2, Cruse, 2000, 70, 35, 0
		L2 car2 = new L2();
		car2.setName("Cruse");
		car2.setEngineSize("2000");
		car2.setOilTank(70);
		car2.setOilSize(35);
		car2.setDistance(0);
		map.put("2",car2);
		L3 car3 = new L3();
		car3.setName("Oska");
		car3.setEngineSize("3000");
		car3.setOilTank(80);
		car3.setOilSize(40);
		car3.setDistance(0);
		map.put("3", car3);
		L4 car4 = new L4();
		car4.setName("Phantom");
		car4.setEngineSize("5000");
		car4.setOilTank(100);
		car4.setOilSize(50);
		car4.setDistance(0);
		map.put("4", car4);
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		int set = sc.nextInt();
		System.out.print("����Ÿ��� �Է��Ͻÿ�: ");
		int move = sc.nextInt();
		
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance");
		System.out.println("---------------------------------------------------------------------------------------");
		for(int i = 1; i < 5; i++) {
			System.out.println(map.get(i+"")); // 1+ "" +> "1"
		}
//		System.out.println(car1);
		
//		car1.setOil(30);
		System.out.println("\n\n" +  set + "����");
		for(int i = 1; i<5; i++) {
			((Car)map.get(i+"")).setOil(set);
		}
//		
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance");
		System.out.println("---------------------------------------------------------------------------------------");
//		System.out.println(car1);
		for (int i = 1; i<5; i++) {
			System.out.println(map.get(i+""));
		}
		
//		car1.go(80);
		System.out.println("\n\n" + move + "����");
		for(int i = 1; i<5; i++) {
			((Car)map.get(i+"")).go(move);
		}
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i = 1; i<5; i++) {
			System.out.print(map.get(i+"") + "\t\t");
			String key = i+"";
			switch(key) {
			case "1":
				System.out.println(""+((L1)map.get(key)).getTempGage());
				break;
			case "2":
				System.out.println(""+((L2)map.get(key)).getTempGage());
				break;
			case "3":
				System.out.println(""+((L3)map.get(key)).getTempGage());
				break;
			case "4":
				System.out.println(""+((L4)map.get(key)).getTempGage());
				break;
			}
		}
			
		
	}
	

}
