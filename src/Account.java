
public class Account {
	
	private String accountNumber;
	private double balance;
	private Transaction[] transactions;
	
	public Account(String accountNumber, double balance, Transaction[] transactions) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transactions;
	}
	
	public void withdraw(double transactionAmount) {
		double tentativeBalance = balance - transactionAmount;
		if (tentativeBalance > 0) {
			balance = tentativeBalance;
		}
	}
	
	public void deposit(double transactionAmount) {
		balance += transactionAmount;
		if (transactionAmount == 10000) {
			balance += 150;
		}
	}
	
	public void displayBalance() {
		System.out.println(balance);
	}
	
	public void printStatement() {
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Type  Transaction  Balance");
		System.out.println("--------------------------");
		
		for (Transaction transaction : transactions) {
			if (transaction.getType() == 'W') {
				this.withdraw(transaction.getAmount());
			} else if (transaction.getType() == 'D') {
				this.deposit(transaction.getAmount());
			}
			transaction.displayTransaction(this.balance);
		}
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		Transaction[] transactions = {
			new Transaction('W', 2000),
			new Transaction('D', 20000),
			new Transaction('D', 500),
			new Transaction('W', 15000),
			new Transaction('D', 10000)
		};
		Account account = new Account("001", 5000, transactions);
		//account.withdraw(1000);
		//account.displayBalance();
		account.printStatement();
	}

}
