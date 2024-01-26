/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
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
