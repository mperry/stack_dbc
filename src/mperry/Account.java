package mperry;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

//@Invariant("balance >= 0")
public class Account {
	
	private int balance = 0;
	
	public Account() {
		this(0);
	}
	
	@Requires("amount >= 0")
	public Account(int amount) {
		balance = amount;
	}
	
	@Requires("amount >= 0")
	@Ensures("balance == old(balance) + amount")
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	@Requires("amount >= 0 && amount <= balance")
	@Ensures("balance == old(balance) - amount")
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Requires({"amount >= 0 && getBalance() >= amount", "to != null", "this != to"})
	@Ensures({"getBalance() == old(getBalance()) - amount && " +
			"to.getBalance() == old(to.getBalance()) + amount"})
	public void transferTo(Account to, int amount) {
		withdraw(amount);
		to.deposit(amount);
	}
	
	public int getBalance() {
		return balance;
	}
	
}
