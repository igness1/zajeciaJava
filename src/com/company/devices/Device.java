package com.company.devices;

public class Device {
    final String producer;
    final String brand;
    final String model;
    private Double value;

    public Device(String producer, String brand, String model) {
        this.producer = producer;
        this.brand = brand;
        this.model = model;
    }


    public Double getValue(){
        return this.value;
    }
    public String toString(){
        return this.producer + " " + this.model;
    }
}
