package command;

public class Main {

    public static void main(String[] args) {
        Appliance tv = new TV();
        Appliance fridge = new Fridge();
        Appliance geyser = new Geyser();

        ApplianceOnCommand tvOnCommand = new ApplianceOnCommand(tv);
        ApplianceOffCommand tvOffCommand = new ApplianceOffCommand(tv);

        ApplianceOnCommand fridgeOnCommand = new ApplianceOnCommand(fridge);
        ApplianceOffCommand fridgeOffCommand = new ApplianceOffCommand(fridge);

        ApplianceOnCommand geyserOnCommand = new ApplianceOnCommand(geyser);
        ApplianceOffCommand geyserOffCommand = new ApplianceOffCommand(geyser);

        Remote remote = new Remote(tvOnCommand);
        remote.pressButton();

        remote.setCommand(tvOffCommand);
        remote.pressButton();

        remote.setCommand(fridgeOnCommand);
        remote.pressButton();

        remote.setCommand(fridgeOffCommand);
        remote.pressButton();

        remote.setCommand(geyserOnCommand);
        remote.pressButton();

        remote.setCommand(geyserOffCommand);
        remote.pressButton();
    }

}
