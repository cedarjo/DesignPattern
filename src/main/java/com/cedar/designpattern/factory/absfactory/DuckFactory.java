package com.cedar.designpattern.factory.absfactory;

import java.util.Random;

public class DuckFactory implements IAnimalFactory {

    @Override
    public AbstractAnimal createAnimal() {
        return new Duck();
    }

    @Override
    public AbstractFeed createFeed() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new Fish();
        } else {
            return new Rice();
        }
    }

}
