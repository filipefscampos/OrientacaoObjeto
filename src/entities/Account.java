package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private int custo = 5;
	
	public Account(int number, String holder, double depositInicial) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(depositInicial);
	}
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void saque(double amount) {
		balance -= (amount + custo);
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
	
	
}
