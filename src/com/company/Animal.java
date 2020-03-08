package com.company;
import java.io.File;


public class Animal {


        final String species;
        String name;
        private Double weight = 2.0D;
        File pic;
        public static final Double DEFAULT_DOG_WEIGHT = 10.0D;
        public static final Double DEFAULT_LION_WEIGHT = 190.0D;
        public static final Double DEFAULT_MOUSE_WEIGHT = 0.05D;

        public Animal(String species) {
            this.species = species;
            if (species == "lion") {
                this.weight = DEFAULT_LION_WEIGHT;
            } else if (species == "mouse") {
                this.weight = DEFAULT_MOUSE_WEIGHT;
            } else if (species == "dog") {
                this.weight = DEFAULT_DOG_WEIGHT;
            }

        }

        void feed() {
            this.weight = this.weight + 0.1D;
            System.out.println("thx for food, my weight is now " + this.weight);
        }
    }
