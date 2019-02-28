package com.company.Creational.FactoryMethod.CarFactory;

public class CarProgram {

    public static void main(String[] args) {

        Car economeCar = CarFactory.getCar(DriveType.ECONOME);
        economeCar.drive();

        Car fastCar = CarFactory.getCar(DriveType.FAST);
        fastCar.drive();

        Car safeCar = CarFactory.getCar(DriveType.SAFE);
        safeCar.drive();
    }
}
