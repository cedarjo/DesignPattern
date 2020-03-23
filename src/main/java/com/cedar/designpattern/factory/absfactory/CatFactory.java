package com.cedar.designpattern.factory.absfactory;

public class CatFactory implements IAnimalFactory {

    @Override
    public AbstractAnimal createAnimal() {
        return new Cat();
    }

    @Override
    public AbstractFeed createFeed() {
        return new Fish();
    }

}
