package com.company.Creational.FactoryMethod.CarFactory;

public class CarFactory {

    public static Car getCar(DriveType type) {

        Car car = null;
        switch (type) {
            case FAST:
                car = new BMW();  // Here we have an option to change providing car for FAST type.
                break;

            case ECONOME:
                car = new FIAT();
                break;

            default:
                throw new RuntimeException("Type is not found");
        }

        return car;
    }
}
