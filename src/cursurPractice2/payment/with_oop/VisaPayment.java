package cursurPractice2.payment.with_oop;

public class VisaPayment extends PaymentAbstract implements AdditionalVerification{
    protected VisaPayment(double amount) {
        super(amount);
    }
    @Override
    public void completePayment() {
        confirmYourIdentify();
        initializePayment();
        System.out.println("Connect to bank API and execute the payment of " + amount + "Euro");
    }
    @Override
    public void confirmYourIdentify() {
        System.out.println("Authorize from bank application");
    }
}
