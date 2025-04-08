package cursurPractice2.payment.no_oop;

//PayPal, Visa, Bank transfer, Stripe

public class PaymentService {
    public void madePayment(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("paypal")) {
            PayPalPayment payPalPayment = new PayPalPayment();
            payPalPayment.completePayment(amount);
        } else if (paymentType.equals("Visa")) {
            System.out.println("Get Visa payment functionality");
        } else if (paymentType.equals("Bank transfer")) {
            System.out.println("Get Bank transfer functionality");
        } else if (paymentType.equals("Stripe")) {
            System.out.println("Get Stripe payment functionality");
        } else {
            System.out.println("Payment method is not valid ");
        }

    }
}
