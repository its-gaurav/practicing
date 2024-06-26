/**
 * Main.java
 */
package decorator;

import decorator.toppings.ExtraCapsicum;
import decorator.toppings.ExtraCheese;
import decorator.toppings.ExtraOlives;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */

// cost calculation of pizza with different toppings
public class Main {
    public static void main(String[] args) {
        // farmhouse pizza
        BasePizza farmHouse = new FarmHouse();
        // farmhouse pizza with extra cheese
        BasePizza farmHouseWithCheese = new ExtraCheese(new FarmHouse());
        // farmhouse pizza with extra olives and capsicum
        BasePizza farmHouseWithOliveCapsicum = new ExtraOlives(new ExtraCapsicum(new FarmHouse()));
        // margherita
        BasePizza margherita = new Margherita();
        // margherita pizza with capsicum
        BasePizza margheritaWithCapsicum = new ExtraCapsicum(new Margherita());

        System.out.println("Cost of farmHouse : "+farmHouse.cost());
        System.out.println("Cost of farmHouseWithCheese : "+farmHouseWithCheese.cost());
        System.out.println("Cost of farmHouseWithOliveCapsicum : "+farmHouseWithOliveCapsicum.cost());
        System.out.println("Cost of margherita : "+margherita.cost());
        System.out.println("Cost of margheritaWithCapsicum : "+margheritaWithCapsicum.cost());
    }
}
