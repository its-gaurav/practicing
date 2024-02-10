package lld.sportsarenabookingplatform;


import java.util.Objects;

public abstract class Arena {
    private String id;
    private User ownedBy;
    private double hourlyCharge;

    public Arena(String id, User ownedBy, double hourlyCharge) {
        this.id = id;
        this.ownedBy = ownedBy;
        this.hourlyCharge = hourlyCharge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(User ownedBy) {
        this.ownedBy = ownedBy;
    }

    public double getHourlyCharge() {
        return hourlyCharge;
    }

    public void setHourlyCharge(double hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arena arena = (Arena) o;
        return id.equals(arena.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Arena{" +
                "id='" + id + '\'' +
                ", ownedBy=" + ownedBy +
                ", hourlyCharge=" + hourlyCharge +
                '}';
    }
}
