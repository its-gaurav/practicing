package lld.ridesharing;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String registration;

    public Vehicle(String model, String registration) {
        this.model = model;
        this.registration = registration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return getRegistration().equals(vehicle.getRegistration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistration());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                '}';
    }
}
