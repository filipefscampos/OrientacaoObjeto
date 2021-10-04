package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	//Construtor padrão da classe;
	public Product() {
		
	}
	
	//Construtor personalizado da classe;
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga do construtor personalizado da classe;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0;
	}
				
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Name: "
				+ name
				+ ", "
				+ "Price: $" 
				+ String.format("%.2f", price) 
				+ ", "
				+ "Quantity: " + quantity
				+ ", "
				+ "Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
	
	
}
