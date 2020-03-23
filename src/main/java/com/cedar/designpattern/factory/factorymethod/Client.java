package com.cedar.designpattern.factory.factorymethod;

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

}

class Client1 {
    IAnimalFactory factory = new RandomAnimalFactory();

    // 随机创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        System.out.println(animal.getName());
    }
}

class Client2 {
    IAnimalFactory factory = new OrderlyAnimalFactory();

    // 按序创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        System.out.println(animal.getName());
    }
}
