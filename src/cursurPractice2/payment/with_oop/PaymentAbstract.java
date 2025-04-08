package cursurPractice2.payment.with_oop;

public abstract class PaymentAbstract {
    protected double amount;
    public PaymentAbstract(double amount) {
        this.amount = amount;
    }
    public void initializePayment() {
        System.out.println("Initial payment details");
    }
    public abstract void completePayment();
}
