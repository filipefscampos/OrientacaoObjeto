package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramListas {

	public static void main(String[] args) {
		
		//Criando a lista e parametrizando seu tipo no caso String
		List <String> list = new ArrayList<>();
		
		//Diversas opera��es que podem ser feitas com List
		//Adicionar
		list.add("Maria");
		list.add("Filipe");
		list.add("Carol");
		
		//Adicionando na posi��o especifica
		list.add(2, "Heloisa");
		
		//Removendo a posi��o
		list.remove("Maria");
				
		for(String x : list) {
			System.out.println(x);
		}
		
		//Tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------");
		
		//Remoendo a posi��o com base em Predicado
		//Remove o valor X do tipo string, retorna se a posi��o 0 for M
		list.removeIf(x -> x.charAt(0) == 'F');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//Tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------");
		
		System.out.println("Posi��o do Carol?: " + list.indexOf("Carol"));
		
		//Quando o IndexOf n�o encontra, ele retorna -1
		System.out.println("Posi��o do Filipe?: " + list.indexOf("Filipe"));
		
		System.out.println("---------------");
		
		//Filtar a lista com uma condi��o: Nesse caso apenas quem come�a com H
		//Preciso declarar uma nova lista com o mesmo tipo
		//E na instancia dessa nova lista usar a Lambda para filtrar
		//No final precisamos converter o Stream para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').toList();
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		//Encontrando o primeiro elemento que come�e com C
		//findFrist entra o primeiro, e orElse caso n�o encontre
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse("N�o encontrado");
		System.out.println(name);
		
		
		
		
	}

}
