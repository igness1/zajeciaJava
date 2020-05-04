package com.company;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Pet dog = new Pet("dog");
        dog.setName("Akita");

      Human human = new Human();
      Human human1 =new Human();
      Car car = new Car("some producer","some brand", "AHSG282653", "someModel");
      Car car1 = new Car("some producer","some brand", "AHSG282653", "someModel");
      human.setCar(car);
      human.setPet(dog);


      System.out.println((car).equals(car1));
      System.out.println(dog);
      System.out.println(car);
      System.out.println(car1);
      human.toString();
      dog.toString();
      car.toString();
















        //garbage collector pozbywa się obiektów, do których nie może się dostać. np: me.pet.myszojeleń.
        //garbage collector uruchamia się gdy za mało miejsca, bez względu na czas, bez okresów czasowych.
        // czemu nie uzywać static:
        //-static to antyobiektowość, nie powinno być innych statycznych metod niz main.
        //
    }
}
