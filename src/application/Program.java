package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		System.out.println("enter product data: ");
		System.out.print(" Name: ");
		product.name = sc.nextLine();
		System.out.print("Price : ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		product.toString();
		
		System.out.println("Product data :"+ product);
		System.out.print("Enter quantity to add: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data:" + product);
		
		System.out.print("Enter quantity to remove: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data:" + product);
		
		sc.close();
	}

}
