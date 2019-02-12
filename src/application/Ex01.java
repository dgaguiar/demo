package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("enter width and height: ");
		
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		
		
		System.out.printf("\n Area = %.2f", rec.area());
		System.out.printf("\n Perimeter = %.2f", rec.perimeter());
		System.out.printf("\n diagonal = %.2f", rec.diagonal());
		
		sc.close();
	}

}
