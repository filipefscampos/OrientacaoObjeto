package application;

import java.util.Scanner;

import util.Calculator;

public class MesmoEstatico2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Circuferencia: %.2f%n", Calculator.circumference(raio));
		System.out.printf("Volume: %.2f%n", Calculator.volume(raio));
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		
		sc.close();

	}

}
