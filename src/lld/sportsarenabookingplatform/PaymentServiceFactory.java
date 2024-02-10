package lld.sportsarenabookingplatform;

public class PaymentServiceFactory {
    private PaymentService cardPaymentService;
    private PaymentService upiPaymentService;

    public PaymentServiceFactory(PaymentService cardPaymentService, PaymentService upiPaymentService) {
        this.cardPaymentService = cardPaymentService;
        this.upiPaymentService = upiPaymentService;
    }

    public PaymentService getPaymentService(String paymentType) {
        if (Constants.UPI.equalsIgnoreCase(paymentType)) {
            return upiPaymentService;
        }
        if (Constants.CARD.equalsIgnoreCase(paymentType)) {
            return cardPaymentService;
        }
        throw new RuntimeException("Payment Type Not Supported");
    }
}
