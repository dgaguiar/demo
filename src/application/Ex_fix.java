package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class Ex_fix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dollar = sc.nextDouble();
		System.out.printf("Ammount to be in reais = %.2f", Dollar.currencyConverter(dollarPrice, dollar));
		
		
		sc.close();
	}

}
