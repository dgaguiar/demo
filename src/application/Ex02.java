package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax : ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ employee.name +", $ " + employee.netSalary());
		
		System.out.println("which percentage to increase salary ? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.print("Updated data: " 
		+ employee.name
		+ ", $ "
		+ String.format("%.2f",employee.netSalary()));
		
		sc.close();
	}

}
