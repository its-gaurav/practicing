package lld.parkinglot;

public class ParkingSpot {
    private double pricePerHour;
    private Vehicle parkedVehicle;

    private boolean isEmpty = true;

    public ParkingSpot(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "pricePerHour=" + pricePerHour +
                ", parkedVehicle=" + parkedVehicle +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
