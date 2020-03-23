package com.cedar.designpattern.factory.absfactory;

public interface IAnimalFactory {

    AbstractAnimal createAnimal();

    AbstractFeed createFeed();

}
