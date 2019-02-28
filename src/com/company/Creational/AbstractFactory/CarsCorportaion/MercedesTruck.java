package com.company.Creational.AbstractFactory.CarsCorportaion;

public class MercedesTruck implements Car {
    @Override
    public void drive() {
        System.out.printf("MercedesTruck: I am big car from Germany \n");
    }

    @Override
    public void stop() {

    }
}
