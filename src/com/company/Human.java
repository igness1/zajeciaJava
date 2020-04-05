package com.company;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Human {


    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;

    List<ZonedDateTime> readingSalaryTime = new ArrayList<ZonedDateTime>();

    private Double salary = 200.0;


    //odczytywanie wypłaty i zapisywanie czasu odczytywania w liście
    public Double getSalary(){
        readingSalaryTime.add(ZonedDateTime.now());
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //dawanie podwyżki, wysyłanie info, sprawdzanie czy podwyżka nie jest ujemna.
    public void giveRise(double rise){
        if(rise<0){
            System.out.println("You can't give a negative rise.");
        }
        else{
            System.out.println("You must collect and sign the annex to the contract.");
            System.out.println("We send data to the accounting system.");
            System.out.println("We send updated data to ZUS and US.");
            this.salary += rise;

        }
    }

    public void setCar(Car car) {
        if (car.getValue() <= this.salary) {
            System.out.println("Great you can buy it by cash");
            this.car = car;
        } else if ( (car.getValue()/12) <= this.salary) {
            System.out.println("Not great, but you can buy it on credit");
            this.car = car;
        } else {
            System.out.println("Sorry, get a rise");
        }
    }

    public Car getCar() {
        return this.car;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }




    }
