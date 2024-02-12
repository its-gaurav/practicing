package lld.sportsarenabookingplatform;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PartialRefundOnCancellation implements CancellationStrategy {
    @Override
    public double calculateRefundAmount(BookingDetail bookingDetail) {
        // if cancellation-time (currentTime) and booking-start-time difference is greater than 24 hours refund full amount
        // else refund 50%
        if (ChronoUnit.HOURS.between(bookingDetail.getBookingStartTime(), LocalDateTime.now()) > 24) {
            return bookingDetail.getTotalFare();
        }
        return bookingDetail.getTotalFare()/2;
    }
}
