package com.company.devices;

public class Car extends Device{


    final String registrationNumber;
    public String plates;



    public Car(String producer, String brand, String registrationNumber,String model) {
        super(producer, brand, model);


        this.registrationNumber = registrationNumber;

    }



}
