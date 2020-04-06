package com.company.devices;

import com.company.Saleable;

public class Device implements Saleable {
    final String producer;
    final String brand;
    final String model;
    private Double value= 2000.0;

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

    @Override
    public void sell() {

        System.out.println("Okey, you sold " + this);

    }
}
