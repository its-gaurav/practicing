/**
 * Olives.java

 */
package decorator.pizzamaker.toppings;

import decorator.pizzamaker.BasePizza;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class ExtraOlives extends ToppingDecorator{

    private BasePizza pizza;

    public ExtraOlives(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 20 + pizza.cost();
    }
}
