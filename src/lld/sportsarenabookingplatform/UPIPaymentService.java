package lld.sportsarenabookingplatform;

public class UPIPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of "+amount+" processed through upi");
    }
}
