public class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    // Constructor
    public BankAccount(int accNo, String custName, String accType, float initialBalance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = initialBalance;
        if (accType.equals("Savings") && balance < 1000) {
            throw new LowBalanceException("LowBalance: Minimum balance for savings account is 1000");
        } else if (accType.equals("Current") && balance < 5000) {
            throw new LowBalanceException("LowBalance: Minimum balance for current account is 5000");
        }
    }

  public void deposit(float amt) {
        if (amt < 0) {
            throw new NegativeAmountException("NegativeAmount: Cannot deposit a negative amount");
        }
        balance += amt;
    }
 public float getBalance() {
        if (balance < 0) {
            throw new NegativeAmountException("NegativeAmount: Balance is negative");
        }
        return balance;
    }
   static class NegativeAmountException extends RuntimeException {
        public NegativeAmountException(String message) {
            super(message);
        }
    }   static class LowBalanceException extends RuntimeException {
        public LowBalanceException(String message) {
            super(message);
        }
    }
  public static void main(String[] args) {
        try {
            BankAccount savingsAccount = new BankAccount(123, "John", "Savings", 900);
            savingsAccount.deposit(100); // Deposit 100
            System.out.println("Current balance: $" + savingsAccount.getBalance());

            BankAccount currentAccount = new BankAccount(456, "Mary", "Current", -900);
            System.out.println("Current balance: $" + currentAccount.getBalance()); // Throws NegativeAmountException
        } catch (NegativeAmountException | LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
