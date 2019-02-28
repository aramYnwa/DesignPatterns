package com.company.Creational.AbstractFactory.CarsCorportaion;


public class CarsCorporation {

    public static CarAbstractFactory getCarFactory(ProducerCountry country) {

        CarAbstractFactory factory;

        switch (country) {
            case SWEDEN:
                factory = new SwedishCarFactory();
                break;

            case GERMANY:
                factory = new GermanCarFactory();
                break;

            default:
                throw new RuntimeException("Car factory is not found for the specified type of country");
        }

        return factory;
    }
}
