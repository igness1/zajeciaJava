package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device{


    final String registrationNumber;
    public String plates;
    public final Integer yearOfProduction;



    public Car(String producer, String brand, String registrationNumber,String model, Integer yearOfProduction) {
        super(producer, brand, model);
        this.yearOfProduction= yearOfProduction;
        this.registrationNumber = registrationNumber;
    }

    abstract void refuel();

    public int compare(Car car){
        return (int) (this.yearOfProduction -car.yearOfProduction);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price,Integer indeks) throws Exception {
        if(seller.getCar(indeks)==this){
            if(buyer.getCash()>=price){
                buyer.setCar(this);
                seller.setCar(null);
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                System.out.println("Seller sold car, buyer bought car");
            }
            else{
                System.out.println("Buyer haven't enough cash to buy car.");
            }
        }
        else{
            throw new Exception("Seller can't sell not his car.");
        }
    }

}
