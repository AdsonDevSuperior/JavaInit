package entities;

public class Account {
	
	private int number;
	private String holder;
	private int password;
	private double balance;
	
	public Account(int account, String holder, int password) {
		this.number = account;
		this.holder = holder;
		this.password = password;
	}
	public Account(int account, String holder, int password, double initialDeposit) {
		this.number = account;
		this.holder = holder;
		this.password = password;
		deposit(initialDeposit);
	}
	public int getAccount() {
		return number;
	}
	public void setAccount(int account) {
		this.number = account;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public void deposit(double amount) {
		balance +=amount;
		
	}
	public void withDraw(double amount) {
		balance -= amount;
	}
	public String toString() {
		return "account :"
				+ number
				+ ", Holder: "
				+ holder
				+ ", Password: "
				+ password
				+ ", Balance $"
				+ String.format("%.2f", balance);
	}

}
