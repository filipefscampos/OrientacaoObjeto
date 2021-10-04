package application;

import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Nome do Titular: ");
		String nome = sc.next();
		System.out.print("Salo inicial: ");
		double amount = sc.nextDouble();
		System.out.println();
		
		Account act = new Account(number, nome, amount);
		
		System.out.println("Dados da conta: ");
		System.out.println(act);
		System.out.println();
		
		char check = 'S';
		while(check == 'S') {
			System.out.println("Deseja fazer um deposito? S/N");
			check = sc.next().charAt(0);
			if(check == 'N') {
				break;
			}else {
				System.out.println("Quanto vai depositar?");
				amount = sc.nextDouble();
				act.deposit(amount);
				System.out.println("Dados da conta atualizado: ");
				System.out.println(act);
				check = 'S';
			}
			
		}
		
		check = 'S';
		while(check == 'S') {
			System.out.println("Deseja fazer saque? (Custo de R$ 5,00) S/N");
			check = sc.next().charAt(0);
			if(check == 'N') {
				break;
			}else {
				System.out.println("Quanto vai sacar?");
				amount = sc.nextDouble();
				act.saque(amount);
				System.out.println("Dados da conta atualizado: ");
				System.out.println(act);
				check = 'S';
			}
			
		}
		
		System.out.println("Operação Finalizada!");
		
		
		
		sc.close();
		
		
		
	}

}
