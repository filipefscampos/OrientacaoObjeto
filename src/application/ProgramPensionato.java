package application;

import java.util.Scanner;

import entities.AlunoQuarto;

public class ProgramPensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		AlunoQuarto[] vect = new AlunoQuarto[n];
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.next();
			String email = sc.next();
			int quarto = sc.nextInt();
			vect[i] = new AlunoQuarto(name, email, quarto);
		}
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}
