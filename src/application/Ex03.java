package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.print("Digite as 3 notas trimestrais do aluno");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE  = %.2f %n",aluno.finalGrade());
		
		if (aluno.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", aluno.missingPoints() );
		} else {
			System.out.println("PASS");
		}

		
		
		sc.close();

	}

}
