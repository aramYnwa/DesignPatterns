package com.company.Structural.Decorator.PizzaTask.ToppingDecorators;

import com.company.Structural.Decorator.PizzaTask.Pizzas.AbstractPizza;

public class PizzaWithExtraCheese extends ToppingDecorator {

    public PizzaWithExtraCheese(AbstractPizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.toppingPrice = 0.99;
    }
}
