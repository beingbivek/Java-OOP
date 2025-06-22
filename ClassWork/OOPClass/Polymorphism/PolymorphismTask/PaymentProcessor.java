abstract class PaymentMethod {
    abstract boolean validatePaymentDetails();
    abstract void processTransaction(double amount);
}

class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;

    CreditCardPayment(String cardNumber, String cardHolder, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    boolean validatePaymentDetails() {
        System.out.println("Validating credit card details...");
        return cardNumber.length() == 16;
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends PaymentMethod {
    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    boolean validatePaymentDetails() {
        System.out.println("Validating PayPal account...");
        return email.contains("@");
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class BankTransferPayment extends PaymentMethod {
    private String accountNumber;
    private String bankCode;

    BankTransferPayment(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    boolean validatePaymentDetails() {
        System.out.println("Validating bank transfer details...");
        return accountNumber.length() >= 10 && bankCode.length() == 5;
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCardPayment("1234567890123456", "John Doe", "12/26"),
            new PayPalPayment("john@example.com"),
            new BankTransferPayment("9876543210", "12345")
        };

        double amount = 150.75;

        for (PaymentMethod payment : payments) {
            if (payment.validatePaymentDetails()) {
                payment.processTransaction(amount);
            } else {
                System.out.println("Payment validation failed.");
            }
            System.out.println("-----");
        }
    }
}
