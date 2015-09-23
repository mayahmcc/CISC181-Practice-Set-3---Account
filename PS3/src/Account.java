import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {

	}

	public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
	}

	public int Getid() { 
		return id;
	}

	public void Setid(int id) {
		this.id = id;

	}

	public double Getbalance() {
		return balance;
	}

	public void Setbalance(double balance) {
		this.balance = balance;
	}

	public double GetannualInterestRate() {
		return this.annualInterestRate;
	}

	public void SetannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date GetdateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return GetannualInterestRate() / 12;

	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount < balance) {
			balance -= amount;

		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

}