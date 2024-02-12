package lld.sportsarenabookingplatform;

public interface CancellationStrategy {

    double calculateRefundAmount(BookingDetail bookingDetail);
}
