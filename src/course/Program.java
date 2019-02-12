package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk"; 
		
		int age = 30; 
		int code = 5290; 
		char gender = 'F'; 
		
		double price1 = 2100.0; 
		double price2 = 650.0; 
		double measure = 53.234567; 
		
		System.out.println("Products");
		System.out.printf( " \n %s, which price is $ %.2f ", product1, price1);
		System.out.printf("\n %s, which price is $ %.2f ", product2, price2);
		System.out.println();		
		System.out.printf("\n\n Record: %d years old, code %d and gender : %c.", age, code, gender);
		System.out.printf("\n\n Measure with eight decimal places %.8f\n Rouned (three decimal places) : %.3f \n", measure, measure );
		Locale.setDefault(Locale.US);
		System.out.printf("  US decimal point: %.3f", measure);
	}

}
