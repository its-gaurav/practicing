package command;

public class Geyser implements Appliance{

    @Override
    public void on() {
        System.out.println("Geyser is ON");
    }

    @Override
    public void off() {
        System.out.println("Geyser is OFF");
    }
}
