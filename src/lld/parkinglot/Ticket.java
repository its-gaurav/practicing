package lld.parkinglot;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime entryTime;
    private ParkingSpot parkingSpot;

    public Ticket(LocalDateTime entryTime, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
