package cursurPractice2.payment.with_oop;

public class PaypalPayment extends PaymentAbstract implements ExistingAccount {
    protected PaypalPayment(double amount) {
        super(amount);

    }
    @Override
    public void completePayment() {
        createAccount();
        initializePayment();
        System.out.println("Conect to paypal API and execute the payment " + amount + "euro");
    }

    @Override
    public void createAccount() {
        System.out.println("Go to PayPal site and create account");
    }
}
