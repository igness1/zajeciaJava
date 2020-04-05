package com.company;

public class Car {
    final String producer;
    final String brand;
    final String registrationNumber;
    final String model;

    public String plates;
    private Double value = 2000.0;


    public Car(String producer, String brand, String registrationNumber,String model) {
        this.brand=brand;
        this.producer=producer;
        this.registrationNumber = registrationNumber;
        this.model=model;
    }
    public Double getValue(){
        return this.value;
    }

    public String toString(){
        return this.producer + " " + this.model + " " + this.plates;
    }
}
