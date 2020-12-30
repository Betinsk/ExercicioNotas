package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Studdent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studdent studdent = new Studdent();
		
		studdent.name = sc.nextLine();
		double total = 0;
		
		for(int i=0;i<3;i++) {
			double points = sc.nextDouble();
			total += points;
		}
		double fail = 60 - total;
		if(total >=60) {
			System.out.printf("FINAL GRADE = " + String.format("%.2f%n", total));
			System.out.println("PASS");
		}
		
		else {
			System.out.printf("FINAL GRADE = " + String.format("%.2f%n", total));
			System.out.println("FAIL");
			System.out.println("MISSING " +fail+ " POINTS");
		
		}
		
		sc.close();
		
	}

}
