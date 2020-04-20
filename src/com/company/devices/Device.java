package com.company.devices;

import com.company.Saleable;
import com.company.Human;

public class Device implements Saleable {
    final String producer;
    final String brand;
    final String model;
    private Double value= 2000.0;
    private Human owner;

    public Device(String producer, String brand, String model) {
        this.producer = producer;
        this.brand = brand;
        this.model = model;
    }

    public void setOwner( Human newOwner){
        owner = newOwner;
    }



    public Double getValue(){
        return this.value;
    }
    public String toString(){
        return this.producer + " " + this.model;
    }

    @Override
    public void sell(Human seller, Human buyer,Double price, Double cash) {

        if(cash>=price && seller == owner){
            cash=-price;
            setOwner(buyer);
            System.out.println("You bought this, becouse you has enough cash.");
        }
        else{
            System.out.println("You don't have enough money to buy.");
        }

    }
}
