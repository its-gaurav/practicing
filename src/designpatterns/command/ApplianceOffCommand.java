package command;

public class ApplianceOffCommand extends Command{

    public ApplianceOffCommand(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void execute() {
        super.getAppliance().off();
    }
}
