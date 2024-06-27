package command;

public abstract class Command {

    private Appliance appliance;

    public Command(Appliance appliance) {
        this.appliance = appliance;
    }

    abstract void execute();

    public Appliance getAppliance() {
        return appliance;
    }
}
