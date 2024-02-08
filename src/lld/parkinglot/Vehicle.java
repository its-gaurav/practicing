package lld.parkinglot;

public class Vehicle {
    private String name;
    private VehicleType type;
    private String registration;

    public Vehicle(String name, VehicleType type, String registration) {
        this.name = name;
        this.type = type;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", registration='" + registration + '\'' +
                '}';
    }
}
