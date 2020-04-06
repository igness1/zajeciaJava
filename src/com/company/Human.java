package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Human extends  Animal{


    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;

    List<ZonedDateTime> readingSalaryTime = new ArrayList<ZonedDateTime>();

    private Double salary = 200.0;

    public Human() {
        super("homo-sapiens");
        this.weight=80.0;
    }


    //odczytywanie wypłaty i zapisywanie czasu odczytywania w liście
    public Double getSalary(){
        readingSalaryTime.add(ZonedDateTime.now());
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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
