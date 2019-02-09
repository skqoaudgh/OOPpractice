package br.com.bank;

public class Account {
	private double balance = 0;
	
	public double getBalance() {
		return this.balance;
	}

	public void deposit(double money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		if(balance < money) {
			throw new IllegalArgumentException("not enough money");
		}
		this.balance -= money;
	}

}