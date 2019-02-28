package com.company.Creational.AbstractFactory.CarsCorportaion;

public class Program {

    public static void main(String[] args) {

        CarAbstractFactory factory = CarsCorporation.getCarFactory(ProducerCountry.GERMANY);
        Car swedishCar = factory.getCar(CarType.SMALL);
        swedishCar.drive();

        factory = CarsCorporation.getCarFactory(ProducerCountry.SWEDEN);
        swedishCar = factory.getCar(CarType.BIG);
        swedishCar.drive();
    }
}
