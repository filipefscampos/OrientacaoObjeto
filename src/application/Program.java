package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		//xA = sc.nextDouble();
		//xB = sc.nextDouble();
		//xC = sc.nextDouble();
		System.out.println("Triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		//yA = sc.nextDouble();
		//yB = sc.nextDouble();
		//yC = sc.nextDouble();
		
		/*
		double p = (x.a + x.b + x.c) / 2;
		//double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		//double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (y.a + y.b + y.c) / 2;
		//p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)); 
		//double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));		 
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Triangulo maior é X: "+areaX);
		}else {
			System.out.println("Triangulo maior é Y: "+areaY);
		}
		*/
		
		System.out.printf("Triangulo X area: %.4f%n", x.area());
		
		System.out.printf("Triangulo Y area: %.4f%n", y.area());
		
		if(x.area() > y.area()) {
			System.out.println("Triangulo maior é X: " + x.area());
		}else {
			System.out.println("Triangulo maior é Y: " + y.area());
		}
		
		
		
		sc.close();

	}

}
