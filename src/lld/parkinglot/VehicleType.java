package lld.parkinglot;

public enum VehicleType {

    TWO_WHLR("TWO_WHLR"),
    FOUR_WHLR("FOUR_WHLR");

    private String name;

    VehicleType(String name) {
    }

    public String getName() {
        return name;
    }
}
