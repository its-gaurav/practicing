package lld.sportsarenabookingplatform;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends User {
    private List<Arena> arenas;

    public Vendor(String id, String name) {
        super(id, name);
        this.arenas = new ArrayList<>();
    }

    public List<Arena> getArenas() {
        return arenas;
    }

    public void setArenas(List<Arena> arenas) {
        this.arenas = arenas;
    }
}
