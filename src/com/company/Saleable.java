package com.company;

import com.company.creatures.Human;

public interface Saleable {
    public void sell(Human seller, Human buyer, Double cash, Integer indeks) throws Exception;
}
