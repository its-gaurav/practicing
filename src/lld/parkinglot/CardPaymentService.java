package lld.parkinglot;

public class CardPaymentService implements PaymentService {
    @Override
    public void processPayment(double fare) {
        System.out.println(fare + " processed through Card");
    }
}
