package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class ProgramFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		int idSalario;
		double percentualAumento;
		
		System.out.print("Quantos funcion�rios registrados?");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i+1) +":");
			System.out.print("ID: ");			
			Integer id = sc.nextInt();
			while(checarID(list, id)) {
				System.out.println("O ID " + id + " j� existe na lista, tente novamente");
				id = sc.nextInt();
			}			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			list.add(emp);			
		}
		
		System.out.println();
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		//1� Exemplo para buscar uma lista usando uma fun��o auxiliar criada
		/*
		System.out.println("Qual ID do funcion�rio que ter� salario reajustado em %?");
		idSalario = sc.nextInt();
		Integer pos = possueID(list, idSalario);
		if(pos == null) {
			System.out.println("ID do Funcion�rio n�o existe na lista");
		}else {
			System.out.println("Entre com a porcentagem de aumento");
			percentualAumento = sc.nextDouble();
			list.get(pos).increaseSalary(percentualAumento);
		}
		*/
		
		//2� Exemplo para buscar uma lista usando stream() / Lambda / Predicate
		System.out.println("Qual ID do funcion�rio que ter� salario reajustado em %?");
		idSalario = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("ID do Funcion�rio n�o existe na lista");
		}else {
			System.out.println("Entre com a porcentagem de aumento");
			percentualAumento = sc.nextDouble();
			emp.increaseSalary(percentualAumento);
		}
		
		System.out.println();
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println();		
		
		
		sc.close();

	}
	
	public static boolean checarID(List<Employee> list, Integer ID) {
		Employee emp = list.stream().filter(x -> x.getId() == ID).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer possueID(List<Employee> list, Integer ID) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == ID) {
				return i;
			}
		}
		return null;
	}
	
	

}
