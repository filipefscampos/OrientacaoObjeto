package util;

public class CurrencyConverter {
	
	public static double converterDollar(double valorDolar, double quantidadeDolar) {
		return valorDolar * quantidadeDolar;
	}
	
	public static double valorIof(double valorDolar, double quantidadeDolar) {
		double total = valorDolar * quantidadeDolar;
		return total * 0.06;
	}
	
}
