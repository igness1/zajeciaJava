package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal dog = new Animal("dog");
        dog.name = "Akita";

      Human human = new Human();
      Car car = new Car("some producer","some brand", "AHSG282653", "someModel");
      human.setCar(car);

        dog.feed();
        dog.feed();

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();







        //garbage collector pozbywa się obiektów, do których nie może się dostać. np: me.pet.myszojeleń.
        //garbage collector uruchamia się gdy za mało miejsca, bez względu na czas, bez okresów czasowych.
        // czemu nie uzywać static:
        //-static to antyobiektowość, nie powinno być innych statycznych metod niz main.
        //
    }
}
