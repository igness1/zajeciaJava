package com.company.devices;

public class Phone extends Device{


    public final Double screenSize;
    public final boolean isAndroid;


    public Phone(String producer, String brand, String model, Double screenSize,boolean isAndroid) {
        super(producer, brand, model);
        this.isAndroid=isAndroid;
        this.screenSize=screenSize;
    }
}

