package com.cedar.designpattern.factory.simplefactory;

public class OrderlyAnimalFactory {

    private Class<? extends AbstractAnimal> previous = Duck.class;

    public AbstractAnimal createAnimal() {
        if (previous == Duck.class) {
            previous = Dog.class;
            return new Dog();
        }
        if (previous == Dog.class) {
            previous = Cat.class;
            return new Cat();
        }
        if (previous == Cat.class) {
            previous = Duck.class;
            return new Duck();
        }
        return null;
    }

}
