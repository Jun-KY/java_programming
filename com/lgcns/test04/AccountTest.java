package com.lgcns.test04;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		// account ��ü ����
		// account �⺻ ���� ���
		// account �� 20000�� �Ա�
		// account ���� ���� ���
		// ���� ��� - �����ܰ� �������� ������ �� ���� �ݾ��� ����Ѵ�.
		System.out.print("�ʱ� �ݾ�: ");
		int stBalance = sc.nextInt();
		account = new Account("", stBalance, 7.3);
		account.setAccount("441-0290-1203");
		sc.nextLine();
		System.out.println();
		
		System.out.println("��������: " + account.getAccount()+ " ���� �ܾ�: $" + account.getBalance());
		System.out.print("deposit / withdraw ? : ");
		String ans = sc.nextLine();
		System.out.print("�ݾ�: ");
		int money = sc.nextInt();
		if (ans.equals("deposit"))
			account.deposit(money);
		if (ans.equals("withdraw"))
			account.withdraw(money);
		System.out.println("��������: " + account.getAccount()+ " ���� �ܾ�: $" + account.getBalance());
		System.out.println("����: " + account.calculateInterest());
			
	}
}
