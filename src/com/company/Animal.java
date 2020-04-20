package com.company;
import com.company.creatures.Pet;

import java.io.File;


public class Animal implements Saleable,Edible{


    final String species;
    String name;
    protected Double weight = 2.0D;
    File pic;
    public static final Double DEFAULT_DOG_WEIGHT = 10.0D;
    public static final Double DEFAULT_LION_WEIGHT = 190.0D;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.05D;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    void feed() {

        if (isAlive()== false) {
            System.out.println("Your dog is already dead, impossible to fead.");
        } else {
            this.weight = this.weight + 1D;
            System.out.println("Your dog is still alive, thx for food, my weight is now " + this.weight);
        }
    }

    void takeForAWalk() {
        if ( isAlive()== false) {
            System.out.println("Your dog is already dead, impossible to go for a walk.");
        } else {
            this.weight = this.weight - 1D;
            System.out.println("Your dog is still alive, thx for walk, my weight is now " + this.weight);
        }
    }

    boolean isAlive(){
        if (this.weight==0){
            return false;
        }
        else return true;
    }

    public String toString(){
        return this.species + " " + this.name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price, Double cash) throws Exception{
        if(this instanceof Human){
            throw new Exception("You can't sell human");

        }
        System.out.println("You bastard");
    }

    @Override
    public void beEaten() throws Exception{
        if(this instanceof Pet){
            throw new Exception("You can't eat pets anymore");

        }
        System.out.println("You ate animal");
    }
}

