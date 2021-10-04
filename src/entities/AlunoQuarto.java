package entities;

public class AlunoQuarto {
	
	String name;
	String email;
	int quarto;
	
	public AlunoQuarto(String name, String email, int quarto) {
		super();
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "AlunoQuarto [name=" + name + ", email=" + email + ", quarto=" + quarto + "]";
	}
	
	
	
	
	
	
}
