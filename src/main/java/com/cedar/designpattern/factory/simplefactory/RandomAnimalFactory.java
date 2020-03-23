package com.cedar.designpattern.factory.simplefactory;

import java.util.Random;

public class RandomAnimalFactory {

    public AbstractAnimal createAnimal() {
        Random random = new Random();
        int val = random.nextInt(3);
        if (val == 0) {
            return new Dog();
        }
        if (val == 1) {
            return new Cat();
        }
        if (val == 2) {
            return new Duck();
        }
        return null;
    }

}
