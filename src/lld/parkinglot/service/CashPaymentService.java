package lld.parkinglot.service;

public class CashPaymentService implements PaymentService {
    @Override
    public void processPayment(double fare) {
        System.out.println(fare + " processed through Cash");
    }
}
