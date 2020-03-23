package com.cedar.designpattern.factory.factorymethod;

public class OrderlyAnimalFactory implements IAnimalFactory {

    private Class<? extends AbstractAnimal> previous = Duck.class;

    @Override
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
