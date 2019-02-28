package com.company.Creational.FactoryMethod.CarFactory;

public class BMW implements Car {

    @Override
    public void drive() {
        System.out.printf("BMW : reaches to 100 in 4s");
    }

    @Override
    public void stop() {
        System.out.printf("BMW : can stop in 1s");
    }
}
