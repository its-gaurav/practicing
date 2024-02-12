package lld.sportsarenabookingplatform;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends User {
    private List<Arena> arenas;
    private CancellationStrategy cancellationStrategy;

    public Vendor(String id, String name, CancellationStrategy cancellationStrategy) {
        super(id, name);
        this.arenas = new ArrayList<>();
        this.cancellationStrategy = cancellationStrategy;
    }

    public List<Arena> getArenas() {
        return arenas;
    }

    public void setArenas(List<Arena> arenas) {
        this.arenas = arenas;
    }

    public CancellationStrategy getCancellationStrategy() {
        return cancellationStrategy;
    }

    public void setCancellationStrategy(CancellationStrategy cancellationStrategy) {
        this.cancellationStrategy = cancellationStrategy;
    }
}
