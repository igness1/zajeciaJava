package com.company.devices;

import java.net.URL;

public class Phone extends Device{


    public final Double screenSize;
    public final boolean isAndroid;


    public Phone(String producer, String brand, String model, Double screenSize,boolean isAndroid) {
        super(producer, brand, model);
        this.isAndroid=isAndroid;
        this.screenSize=screenSize;
    }

    public void installAnApp(String appName){

    }
    public void installAnApp(URL url){

    }
    public void installAnApp(String appName,Integer version){

    }
    public void installAnApp(String[] appNames){
        
    }
}

