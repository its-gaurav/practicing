package lld.parkinglot;

public class UPIPaymentService implements PaymentService {
    @Override
    public void processPayment(double fare) {
        System.out.println(fare + " processed through UPI");
    }
}
