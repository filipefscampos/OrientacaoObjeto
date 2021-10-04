package application;

import java.util.Scanner;

import entities.ProductVector;

public class ProgramVector2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVector[] vect = new ProductVector[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVector(name, price);			
		}
		
		double sum = 0;
		
		for(int i=0; i<vect.length; i++) {
			sum+=vect[i].getPrice();
		}
		
		double media = sum/n;
		
		System.out.println("Média geral: "+media);
		
		
		
		
		sc.close();

	}

}
