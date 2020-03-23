package com.cedar.designpattern.factory.simplefactory;

public class Client {

    public static void main(String[] args) {
        System.out.println("#####Client1#####");
        Client1 client1 = new Client1();
        for (int i = 0; i < 5; i++) {
            client1.createAnimal();
        }

        System.out.println("#####Client2#####");
        Client2 client2 = new Client2();
        for (int i = 0; i < 5; i++) {
            client2.createAnimal();
        }
    }

    /*
     * 简单工厂模式算不上一种设计模式，它只做了公共代码的抽取
     * 假如现在新增一种不是随机创建animal的逻辑，比如按狗、猫、鸭的顺序创建
     * 不同的场景下需要不同的逻辑决定如何做实例化
     * 将这些逻辑封装抽象，编写为工厂，也就是工厂方法模式
     */

}

class Client1 {
    RandomAnimalFactory factory = new RandomAnimalFactory();

    // 随机创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        System.out.println(animal.getName());
    }
}

class Client2 {
    OrderlyAnimalFactory factory = new OrderlyAnimalFactory();

    // 随机创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        System.out.println(animal.getName());
    }
}
