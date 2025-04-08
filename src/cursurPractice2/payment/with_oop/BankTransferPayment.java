package cursurPractice2.payment.with_oop;

public class BankTransferPayment extends PaymentAbstract {
    protected BankTransferPayment(double amount) {
        super(amount);
    }
    @Override
    public void completePayment() {
        initializePayment();
        System.out.println("Get transaction details from client for " +  amount + "Euor");
    }
}
