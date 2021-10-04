package application;

import java.util.Scanner;

import util.Calculator;

public class MembroEstatico1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circumference(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		
		sc.close();

	}

}
