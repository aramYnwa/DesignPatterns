package com.company.Creational.AbstractFactory.CarsCorportaion;

public class SwedishCarFactory implements CarAbstractFactory {

    @Override
    public Car getCar(CarType type) {
        Car car = null;
        switch (type) {
            case BIG:
                car = new VolvoTruck();
                break;

            case SMALL:
                car = new VolvoS();
                break;

            default:
                throw new RuntimeException("Big car is not found for the type specified.");
        }
        return car;
    }
}
