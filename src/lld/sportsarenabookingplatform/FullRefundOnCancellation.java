package lld.sportsarenabookingplatform;

public class FullRefundOnCancellation implements CancellationStrategy {
    @Override
    public double calculateRefundAmount(BookingDetail bookingDetail) {
        return bookingDetail.getTotalFare();
    }
}
