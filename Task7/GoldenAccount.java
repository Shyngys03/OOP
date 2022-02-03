package Task7;
import java.math.BigDecimal;

public class GoldenAccount extends Account {

	// 9
	public GoldenAccount(String number, String status, Client owner, BigDecimal balance) {
		super(number, status, owner, balance);
		this.number = number;
		this.status = status;
		this.owner = owner;
		this.balance = balance;
	}

	// 9.1
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = this.balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalStateException("Not enough cash");
		}

		balance = newBalance;

		operations[opIndex] = "Debit " + amount.toString();
		opIndex++;
	}

	/*
		debit(100)
		balance = 400
		opIndex = 5
		400 - 100 = 300
		operations[5] = 100
		opIndex = 5 + 1 = 6
	*/
	
	// 9.2
	public void paymentForService() {
		BigDecimal newBalance = balance.subtract(new BigDecimal("3000.00"));
		balance = newBalance;
	}

	// 9.3
	protected String balanceBuilder() {
		return "Your balance is " + balance.toString();
		// return super.convertToBigDecimal("5") + 5.0;
		// return "5" + 5.toString(); = "5 5"
	}
}