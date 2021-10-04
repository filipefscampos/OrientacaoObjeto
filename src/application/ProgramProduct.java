package application;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		/*
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		*/
		
		Product product = new Product(name, price);
		
		//alterando nome e price via get e set;
		product.setName("Computador");
		System.out.println("O nome mudou para "+product.getName());
		product.setPrice(1200.22);
		System.out.println("Preco mudou "+product.getPrice());
		
		System.out.println();
		System.out.print("Product data: " + product);
		System.out.println();
		System.out.println();
		
		System.out.print("Entre com a quantidade para"
				+ " adicionar no estoque");
		System.out.println();
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: "+product);
		System.out.println();
		System.out.println();
		
		System.out.print("Entre com a saída do estoque");
		System.out.println();
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Product data: " + product);
		System.out.println();
		System.out.println();
		
		
		
		
		sc.close();
	}

}
