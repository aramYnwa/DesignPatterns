package com.company.Creational.AbstractFactory.CarsCorportaion;

public class VolvoTruck implements Car {
    @Override
    public void drive() {
        System.out.printf("VolvoTruck: I am a big car from Sweden \n");
    }

    @Override
    public void stop() {

    }
}
