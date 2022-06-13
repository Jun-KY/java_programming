package com.lgcns.test04;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		// account 객체 생성
		// account 기본 정보 출력
		// account 에 20000원 입금
		// account 변경 정보 출력
		// 이자 출력 - 현재잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.print("초기 금액: ");
		int stBalance = sc.nextInt();
		account = new Account("", stBalance, 7.3);
		account.setAccount("441-0290-1203");
		sc.nextLine();
		System.out.println();
		
		System.out.println("계좌정보: " + account.getAccount()+ " 현재 잔액: $" + account.getBalance());
		System.out.print("deposit / withdraw ? : ");
		String ans = sc.nextLine();
		System.out.print("금액: ");
		int money = sc.nextInt();
		if (ans.equals("deposit"))
			account.deposit(money);
		if (ans.equals("withdraw"))
			account.withdraw(money);
		System.out.println("계좌정보: " + account.getAccount()+ " 현재 잔액: $" + account.getBalance());
		System.out.println("이자: " + account.calculateInterest());
			
	}
}
