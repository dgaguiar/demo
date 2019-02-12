package course;

import java.util.Locale;
import java.util.Scanner;

public class TestScan {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 3 numebers:  \n");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.printf("\n Higher: %d", n1 );
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.printf("\n Higher: %d", n2);
		} else {	
			System.out.printf("\n Higher: %d", n3);
		}

		
		sc.close();
	}

}
