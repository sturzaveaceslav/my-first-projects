package cursurPractice2.payment.with_oop;

public class StripePayment extends PaymentAbstract implements ExistingAccount {
    protected StripePayment(double amount) {
        super(amount);
    }
    @Override
    public void completePayment() {
        createAccount();
        initializePayment();
        System.out.println("Connect to stripe API and execute the payment of" + amount + "Euro");
    }
    @Override
    public void createAccount() {
        System.out.println("Go to Stripe page and create account");
    }
}
