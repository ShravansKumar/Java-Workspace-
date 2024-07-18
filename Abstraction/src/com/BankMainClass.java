package com;

import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		Bank bank=new BankImpl(5000);

		bank.checkBalance();
		System.out.println("-------");

		System.out.println("Enter amount to be deposited");
		int amountToDeposit=scan.nextInt();

		bank.deposit(amountToDeposit);
		bank.checkBalance();
		System.out.println("--------");

		System.out.println("Enter the amount to be withdrawn :");
		int amountToWithdraw=scan.nextInt();

		bank.withdraw(amountToWithdraw);
		bank.checkBalance();

	}
}
