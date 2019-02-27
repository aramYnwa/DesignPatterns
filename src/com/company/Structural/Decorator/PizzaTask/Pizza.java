package com.company.Structural.Decorator.PizzaTask;

import com.company.Structural.Decorator.PizzaTask.Pizzas.MargaritaPizza;
import com.company.Structural.Decorator.PizzaTask.ToppingDecorators.PizzaWithExtraCheese;
import com.company.Structural.Decorator.PizzaTask.ToppingDecorators.PizzaWithMushroom;

public class Pizza {

    public static void main(String[] args) {

        MargaritaPizza margaritaPizza = new MargaritaPizza();
        System.out.printf("Simple Margarita: %s \n", margaritaPizza.getPizzaPrice());

        PizzaWithExtraCheese pizzaWithExtraCheese = new PizzaWithExtraCheese(margaritaPizza);
        System.out.printf("Margarita with extra cheese: %s \n" ,pizzaWithExtraCheese.getPizzaPrice());

        PizzaWithMushroom pizzaWithMushroom = new PizzaWithMushroom(margaritaPizza);
        System.out.printf("Margarita with mushroom: %s \n",  pizzaWithMushroom.getPizzaPrice());

        PizzaWithMushroom pizzaWithExtraCheeseAndMushroom = new PizzaWithMushroom(pizzaWithExtraCheese);
        System.out.printf("Margarita with extra cheese and mushroom %s \n",
                pizzaWithExtraCheeseAndMushroom.getPizzaPrice());
    }
}
