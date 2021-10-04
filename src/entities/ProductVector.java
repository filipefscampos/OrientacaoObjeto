package entities;

public class ProductVector {
	
	String name;
	double price;
	
	public ProductVector(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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

	@Override
	public String toString() {
		return "ProductVector [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
