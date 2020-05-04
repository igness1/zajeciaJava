package com.company.devices;

public class ElectricCar extends Car {
    public ElectricCar(String producer, String brand, String registrationNumber, String model) {
        super(producer, brand, registrationNumber, model);
    }

    @Override
    void refuel() {
        System.out.println("You fuel you car with electricity");

    }

    public String toString(){
        return "Electric Car " +  this.producer + " " + this.model;
    }
}
