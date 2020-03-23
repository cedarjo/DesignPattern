package com.cedar.designpattern.factory;

import java.util.Random;

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
     * 随机创建一个动物实例
     * 传统方式会将该算法维护到多个地方
     * 假如现在新增一种动物，那么将会对所有维护该算法的地方做修改（违反了OCP原则）
     * 简单工厂就是把维护到多个地方的算法放在一个类（工厂类）当中
     */

}

class Client1 {
    // 随机创建一个animal
    public void createAnimal() {
        Random random = new Random();
        int val = random.nextInt(3);
        AbstractAnimal animal = null;
        if (val == 0) {
            animal = new Dog();
        } else if (val == 1) {
            animal = new Cat();
        } else if (val == 2) {
            animal = new Duck();
        }
        System.out.println(animal.getName());
    }
}

class Client2 {
    // 随机创建一个animal
    public void createAnimal() {
        Random random = new Random();
        int val = random.nextInt(3);
        AbstractAnimal animal = null;
        if (val == 0) {
            animal = new Dog();
        } else if (val == 1) {
            animal = new Cat();
        } else if (val == 2) {
            animal = new Duck();
        }
        System.out.println(animal.getName());
    }
}
