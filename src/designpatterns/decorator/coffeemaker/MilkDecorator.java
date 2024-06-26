package decorator.coffeemaker;

public class MilkDecorator extends CoffeeDecorator{

    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", Milk";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()+0.5;
    }
}
