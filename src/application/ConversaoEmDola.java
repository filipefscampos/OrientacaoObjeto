package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ConversaoEmDola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar do dia?");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos $ dolares deseja comprar?");
		double quantidadeDolar = sc.nextDouble();
		
		double totalDolaSemIof = CurrencyConverter.converterDollar(valorDolar, quantidadeDolar);
		double totalIof = CurrencyConverter.valorIof(valorDolar, quantidadeDolar);
		double total = totalDolaSemIof + totalIof;
		
		System.out.println("O valor total em R$ ser� de: " + totalDolaSemIof);
		System.out.println("Valor de IOF dessa opera��o em R$: " + totalIof);
		System.out.println("Valor total da opera��o em R$: " + total);
		
		
		sc.close();
		
	}

}
