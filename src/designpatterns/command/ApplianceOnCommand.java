package command;

public class ApplianceOnCommand extends Command{

    public ApplianceOnCommand(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void execute() {
        super.getAppliance().on();
    }
}
