package lld.sportsarenabookingplatform;

import java.time.LocalDateTime;
import java.util.Objects;

public class BookingDetail {

    private Arena arena;
    private User bookedBy;
    private LocalDateTime bookingStartTime;
    private LocalDateTime bookingEndTime;
    private double totalFare;
    private boolean isActive = true;


    public BookingDetail(Arena arena, User bookedBy, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime, double totalFare) {
        this.arena = arena;
        this.bookedBy = bookedBy;
        this.bookingStartTime = bookingStartTime;
        this.bookingEndTime = bookingEndTime;
        this.totalFare = totalFare;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }

    public LocalDateTime getBookingStartTime() {
        return bookingStartTime;
    }

    public void setBookingStartTime(LocalDateTime bookingStartTime) {
        this.bookingStartTime = bookingStartTime;
    }

    public LocalDateTime getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(LocalDateTime bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "BookingDetail{" +
                "arena=" + arena +
                ", bookedBy=" + bookedBy +
                ", bookingStartTime=" + bookingStartTime +
                ", bookingEndTime=" + bookingEndTime +
                ", totalFare=" + totalFare +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingDetail that = (BookingDetail) o;
        return Double.compare(that.totalFare, totalFare) == 0 && isActive == that.isActive && Objects.equals(arena, that.arena) && Objects.equals(bookedBy, that.bookedBy) && Objects.equals(bookingStartTime, that.bookingStartTime) && Objects.equals(bookingEndTime, that.bookingEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arena, bookedBy, bookingStartTime, bookingEndTime, totalFare, isActive);
    }
}
