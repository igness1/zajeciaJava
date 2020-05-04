package com.company.creatures;

import com.company.Animal;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void feed(Double foodWeight) {
    this.weight += foodWeight*2;
    }
}
