package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBank;

public class Ex_fix2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
				
		ContaBank contaBank = new ContaBank(conta, name);
		
		double deposit2 = 0.0;
		System.out.print("Is there a inicial deposit (y/n):  ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter inicial deposit value : ");
			deposit2 = sc.nextDouble();
			contaBank = new ContaBank(conta, name, deposit2);
		}
		
		contaBank.setDeposit(deposit2);
		 
		System.out.println("Account data: ");
		System.out.println(contaBank);
				
			
		System.out.print("\nEnter a depoit value : ");
		double deposit3 = sc.nextDouble();
		contaBank.deposito(deposit3);
		
		System.out.println("Account data: ");
		System.out.println(contaBank);
		
		System.out.print("\nEnter a withdraw value : ");
		deposit3 = sc.nextDouble();
		contaBank.withdraw(deposit3);
		
		System.out.println("Account data: ");
		System.out.println(contaBank);
		
		sc.close();

	}

}
