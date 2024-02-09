package lld.parkinglot.service;

import lld.parkinglot.PaymentType;

import java.util.HashMap;
import java.util.Map;

public class PaymentServiceFactory {
    private Map<String, PaymentService> paymentServiceMap;

    public PaymentServiceFactory() {
        this.paymentServiceMap = new HashMap<>();
        paymentServiceMap.put(PaymentType.CARD, new CardPaymentService());
        paymentServiceMap.put(PaymentType.UPI, new UPIPaymentService());
        paymentServiceMap.put(PaymentType.CASH, new CashPaymentService());
    }

    public PaymentService getPaymentService(String paymentType) {
        switch (paymentType) {
            case PaymentType.CARD:
            case PaymentType.UPI:
            case PaymentType.CASH:
                return paymentServiceMap.get(paymentType);
            default:
                System.out.println("Not a valid payment type");
                return null;
        }
    }
}
