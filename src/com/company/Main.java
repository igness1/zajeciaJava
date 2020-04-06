package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Animal dog = new Animal("dog");
        dog.name = "Akita";

      Human human = new Human();
      Car car = new Car("some producer","some brand", "AHSG282653", "someModel");
      human.setCar(car);
      human.pet=dog;

      try{
      human.pet.beEaten();

      human.pet.sell();
      human.getCar().sell();
      human.sell();
    } catch (Exception e) {

    }










        //garbage collector pozbywa się obiektów, do których nie może się dostać. np: me.pet.myszojeleń.
        //garbage collector uruchamia się gdy za mało miejsca, bez względu na czas, bez okresów czasowych.
        // czemu nie uzywać static:
        //-static to antyobiektowość, nie powinno być innych statycznych metod niz main.
        //
    }
}
