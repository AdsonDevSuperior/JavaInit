package Aplication;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Enter account password: ");
		int password = sc.nextInt();	
		System.out.println();
		
		System.out.print("Is there an initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);
		System.out.println();
		
		if(response == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, password, initialDeposit);
		}
		else {
			account = new Account(number, holder, password);
		}
		System.out.println();
		System.out.print("update data: ");
		System.out.println();
			
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.print(account);
		
		System.out.println();
		System.out.print("update data: ");
		System.out.println();
		
		System.out.print("Enter withdraw value: ");
		double withDraw = sc.nextDouble();
		account.deposit(withDraw);
		System.out.print(account);
					
		
		sc.close();
	}

}
