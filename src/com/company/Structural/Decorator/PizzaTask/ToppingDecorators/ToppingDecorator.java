package com.company.Structural.Decorator.PizzaTask.ToppingDecorators;

import com.company.Structural.Decorator.PizzaTask.Pizzas.AbstractPizza;

public abstract class ToppingDecorator extends AbstractPizza {

    private AbstractPizza pizza;
    protected double toppingPrice;

    public ToppingDecorator(AbstractPizza pizzaToDecorate) {
        this.pizza = pizzaToDecorate;
    }

    @Override
    public double getPizzaPrice(){
        return this.pizza.getPizzaPrice() + toppingPrice;
    }
}
