package lld.sportsarenabookingplatform;

public class CardPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of "+amount+" processed through card");
    }
}
