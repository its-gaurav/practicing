package decorator.coffeemaker;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee:: price $"+simpleCoffee.getPrice()+", description "+simpleCoffee.getDescription());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Coffee With Milk:: price $"+coffeeWithMilk.getPrice()+", description "+coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Coffee With Milk And Sugar:: " +
                "price $"+coffeeWithMilkAndSugar.getPrice()+", description "+coffeeWithMilkAndSugar.getDescription());
    }
}
