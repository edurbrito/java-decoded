
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
    private double balance; // How much is own by the person

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     * 
     * @param balance the initial balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits money into the bank account.
     * 
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     * 
     * @return the current balance
     */
    public double getBalance() {
        return this.balance;
    }
}