package lld.elevatorsystem;

import java.util.List;

public class Building {
    private String id;
    private List<Floor> floors;

    public Building(String id, List<Floor> floors) {
        this.id = id;
        this.floors = floors;
    }
}
