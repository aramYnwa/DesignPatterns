package com.company.Creational.FactoryMethod.CarFactory;

public class FIAT implements Car {
    @Override
    public void drive() {
        System.out.printf("FIAT: reaches to 100 in 10s \n");
    }

    @Override
    public void stop() {
        System.out.printf("FIAT: can stop in 5s \n");
    }
}
