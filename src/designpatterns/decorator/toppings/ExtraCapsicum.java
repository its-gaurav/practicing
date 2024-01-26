/**
 * ExtraCapsicum.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package decorator.toppings;

import decorator.BasePizza;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class ExtraCapsicum extends ToppingDecorator{

    private BasePizza pizza;

    public ExtraCapsicum(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 12 + pizza.cost();
    }
}
