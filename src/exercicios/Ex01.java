package exercicios;

import java.util.Scanner;

public class Ex01 {
//
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
			
		for (int x = 1 ; x <= n; x++ ) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}
		
		
		sc.close();
	}

}
