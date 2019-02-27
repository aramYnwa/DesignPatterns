package com.company.Structural.Decorator.PizzaTask.ToppingDecorators;

import com.company.Structural.Decorator.PizzaTask.Pizzas.AbstractPizza;

public class PizzaWithMushroom extends ToppingDecorator {
    public PizzaWithMushroom(AbstractPizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.toppingPrice = 0.5;
    }
}
