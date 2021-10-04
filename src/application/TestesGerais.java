package application;

public class TestesGerais {

	public static void main(String[] args) {
		
		/*
		//Boxing (Encaixotamento)
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		//Unboxing
		int y = (int)obj;
		System.out.println(y);
		
		//Wrapper clases - São os tipos primitivos em formato de calsses
		//Muito utilizados quando precisamos que aceite Null
		//Ex: Quando estamos ligando aos campos de um DB
		String name;
		Double Price;
		Integer quantidade;
		*/
		
		//For each
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//Podemos declarar o apelido do mesmo tipo da coleção
		//e depois informar a coleção, sendo que o obj equivale ao vect[i]
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		System.out.println("Alterando alguma coisa para subir pro git");
		

	}

}
