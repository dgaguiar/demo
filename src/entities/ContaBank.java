package entities;

public class ContaBank {
	
	private int conta; 
	private String name; 
	private double deposit; 
	
	public ContaBank(int conta, String name) {
		
		this.conta = conta;
		this.name = name;
	}
	
	
	public ContaBank(int conta, String name, double deposit) {
		
		this.conta = conta;
		this.name = name;
		this.deposit = deposit;
	}



	public int getConta() {
		return conta;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double deposito (double deposit) {
		return this.deposit += deposit;
	}
	
	public double withdraw (double withdraw) {
		return this.deposit -= (withdraw+5);
	}
	
	public String toString () {
		return "Account"
				+ conta 
				+ ", Holder: "
				+ name
				+", balanço: $"
				+ String.format("%.2f",deposit);
	}
	
}
