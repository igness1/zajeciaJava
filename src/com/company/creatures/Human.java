package com.company.creatures;

import com.company.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Human extends Animal {


    String firstName;
    String lastName;
    Pet pet;
    Phone phone;
    private Car car;
    private Double cash;
    public Car[] garage;

    public void decideHowManyCarsYouCouldHave{
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cars could you have?");
        Integer i = scanner.nextInt();
        Car[] garage = new Car[i];


    }
    public void sumValueOfCars(Car[] garage){
        for(Car cars : garage){
            Double value = 0.0;
            value +=cars.getValue();
        }
    }

    public void sortByYearOfProduction(Car[] garage){
        Arrays.sort(garage);
    }



    List<ZonedDateTime> readingSalaryTime = new ArrayList<ZonedDateTime>();
    List<Double> salaryList = new ArrayList<Double>();
    private Double salary = 200.0;

    public Human() {
        super("homo-sapiens");
        this.weight=80.0;
    }

    public Pet setPet(Pet pet){
        return this.pet=pet;
    }
    public Pet getPet(){
        return this.pet;
    }

    //odczytywanie wypłaty i zapisywanie czasu odczytywania w liście
    public Double getSalary(){
        readingSalaryTime.add(ZonedDateTime.now());
        salaryList.add(salary);

        for(int i=0;i<readingSalaryTime.size();i++){
            System.out.println("Checking time: "+ readingSalaryTime.get(i)+
                    " and then salary was: "+ salaryList.get(i)
            );
        }

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
            this.car=car;
        } else if ( (car.getValue()/12) <= this.salary) {
            System.out.println("Not great, but you can buy it on credit");
            this.car = car;
        } else {
            System.out.println("Sorry, get a rise");
        }
    }

    public Car getCar(Integer indeks) {
        return this.garage[indeks];
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }


    @Override
    public void feed(Double foodWeight) {
        this.weight += foodWeight;
    }

    public Double getCash() { return this.cash; }
    public Double setCash(Double cash){ return this.cash=cash; }
}
