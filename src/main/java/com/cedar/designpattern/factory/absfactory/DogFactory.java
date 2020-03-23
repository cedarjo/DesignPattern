package com.cedar.designpattern.factory.absfactory;

public class DogFactory implements IAnimalFactory {

    @Override
    public AbstractAnimal createAnimal() {
        return new Dog();
    }

    @Override
    public AbstractFeed createFeed() {
        return new Bone();
    }

}
