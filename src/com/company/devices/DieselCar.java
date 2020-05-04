package com.company.devices;

public class DieselCar extends Car {
    public DieselCar(String producer, String brand, String registrationNumber, String model) {
        super(producer, brand, registrationNumber, model);
    }

    @Override
    void refuel() {
        System.out.println("You fuel you car with diesel");
    }

    public String toString(){
        return "Diesel Car " +  this.producer + " " + this.model;
    }
}
