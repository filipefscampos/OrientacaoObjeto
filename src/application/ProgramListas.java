package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramListas {

	public static void main(String[] args) {
		
		//Criando a lista e parametrizando seu tipo no caso String
		List <String> list = new ArrayList<>();
		
		//Diversas operações que podem ser feitas com List
		//Adicionar
		list.add("Maria");
		list.add("Filipe");
		list.add("Carol");
		
		//Adicionando na posição especifica
		list.add(2, "Heloisa");
		
		//Removendo a posição
		list.remove("Maria");
				
		for(String x : list) {
			System.out.println(x);
		}
		
		//Tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------");
		
		//Remoendo a posição com base em Predicado
		//Remove o valor X do tipo string, retorna se a posição 0 for M
		list.removeIf(x -> x.charAt(0) == 'F');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//Tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------");
		
		System.out.println("Posição do Carol?: " + list.indexOf("Carol"));
		
		//Quando o IndexOf não encontra, ele retorna -1
		System.out.println("Posição do Filipe?: " + list.indexOf("Filipe"));
		
		System.out.println("---------------");
		
		//Filtar a lista com uma condição: Nesse caso apenas quem começa com H
		//Preciso declarar uma nova lista com o mesmo tipo
		//E na instancia dessa nova lista usar a Lambda para filtrar
		//No final precisamos converter o Stream para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').toList();
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		//Encontrando o primeiro elemento que começe com C
		//findFrist entra o primeiro, e orElse caso não encontre
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse("Não encontrado");
		System.out.println(name);
		
		
		
		
	}

}
