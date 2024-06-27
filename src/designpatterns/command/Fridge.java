package command;

public class Fridge implements Appliance{

    @Override
    public void on() {
        System.out.println("Fridge is ON");
    }

    @Override
    public void off() {
        System.out.println("Fridge is OFF");
    }
}
