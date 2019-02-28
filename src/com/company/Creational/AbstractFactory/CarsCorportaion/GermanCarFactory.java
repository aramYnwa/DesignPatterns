package com.company.Creational.AbstractFactory.CarsCorportaion;

public class GermanCarFactory implements CarAbstractFactory {
    @Override
    public Car getCar(CarType type) {

        Car car = null;
        switch (type) {
            case SMALL:
                car = new MercedesSClass();
                break;

            case BIG:
                car = new MercedesTruck();
                break;

            default:
                throw new RuntimeException("Swedish car is not found for the type specified.");
        }
        return car;
    }
}
