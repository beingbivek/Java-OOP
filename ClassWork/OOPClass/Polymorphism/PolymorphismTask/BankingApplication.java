class Account {
    protected String accountHolder;
    protected double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.03;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    private int termInYears;

    FixedDepositAccount(String accountHolder, double balance, int termInYears) {
        super(accountHolder, balance);
        this.termInYears = termInYears;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.06 * termInYears;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Account generalAccount = new Account("Alice", 10000);
        SavingsAccount savings = new SavingsAccount("Bob", 15000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("Charlie", 20000, 3);

        System.out.println(generalAccount.accountHolder + "'s Interest: $" + generalAccount.calculateInterest());
        System.out.println(savings.accountHolder + "'s Interest: $" + savings.calculateInterest());
        System.out.println(fixedDeposit.accountHolder + "'s Interest: $" + fixedDeposit.calculateInterest());
    }
}
