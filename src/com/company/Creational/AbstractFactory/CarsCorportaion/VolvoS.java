package com.company.Creational.AbstractFactory.CarsCorportaion;

public class VolvoS implements Car {
    @Override
    public void drive() {
        System.out.printf("VolvoS: I move people safely \n");
    }

    @Override
    public void stop() {

    }
}
