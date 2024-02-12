package lld.sportsarenabookingplatform;

public class NoRefundOnCancellation implements CancellationStrategy {
    @Override
    public double calculateRefundAmount(BookingDetail bookingDetail) {
        return 0d;
    }
}
