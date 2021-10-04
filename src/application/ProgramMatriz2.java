package application;

import java.util.Scanner;

public class ProgramMatriz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Digite um número a ser buscado: ");
		int x = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(x == mat[i][j]) {
					System.out.println(x + " encontrado linha " +i +" coluna " +j);
					System.out.println();
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Em riba: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		sc.close();

	}

}
