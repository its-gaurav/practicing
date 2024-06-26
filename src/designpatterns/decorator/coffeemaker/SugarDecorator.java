package decorator.coffeemaker;

public class SugarDecorator extends CoffeeDecorator{

    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", Sugar";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()+0.2;
    }
}
