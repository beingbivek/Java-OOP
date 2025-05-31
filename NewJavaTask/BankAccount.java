package NewJavaTask;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accNo, String holder) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = 0.0;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC12345", "Sita Sharma");

        myAccount.deposit(10000);
        myAccount.withdraw(2500);

        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}

