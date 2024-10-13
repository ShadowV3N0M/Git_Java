// BankAccount.java
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
// SavingsAccount.java
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nDeposited " + amount + " to Savings Account. New Balance: " + balance);
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrew " + amount + " from Savings Account. New Balance: " + balance);
        } else {
            System.out.println("\nInvalid withdrawal amount or insufficient balance.");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("\nInterest added. New Balance: " + balance);
    }
}
// CurrentAccount.java
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nDeposited " + amount + " to Current Account. New Balance: " + balance);
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("\nWithdrew " + amount + " from Current Account. New Balance: " + balance);
        } else {
            System.out.println("\nInvalid withdrawal amount or exceeds overdraft limit.");
        }
    }
}
public class MainBank {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(1000, 0.05);
        savings.deposit(200);
        savings.withdraw(150);
        savings.addInterest();

        CurrentAccount current = new CurrentAccount(500, 100);
        current.deposit(300);
        current.withdraw(700);
        current.withdraw(200);
	}
}
