package cursurPractice2.payment.with_oop;



public class Store {
    public PaymentAbstract payForOrder (String payerPaymentType, double amount) {
        PaymentAbstract paymentAbstract = null;
                switch (payerPaymentType) {
            case "PAYPAL":
                paymentAbstract = new PaypalPayment(amount);
                break;
                    case "VISA":
                    paymentAbstract = new VisaPayment(amount);
                break;
                    case "BankTransfer":
                        paymentAbstract = new BankTransferPayment(amount);
                        break;
                    case "Stripe":
                        paymentAbstract = new StripePayment(amount);
                        break;
                        default:
                            System.out.println("Not a valid payment type");

                }
                return paymentAbstract;
    }
    public ExistingAccount payForOrderFromAccounts (String payerPaymentType, double amount) {
        if (payerPaymentType.equals("PAYPAL")) {
            return new PaypalPayment(amount);
        } else if (payerPaymentType.equals("VISA")) {
            return new StripePayment(amount);
        }
        return null;

    }


    }

