package com.company.Creational.AbstractFactory.CarsCorportaion;

public class MercedesSClass implements Car {
    @Override
    public void drive() {
        System.out.printf("MercedesSClass: I move people comfortably \n");
    }

    @Override
    public void stop() {
        System.out.printf("MercedesSClass: I stop nicely \n");
    }
}
