package com.cedar.designpattern.factory.absfactory;

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

        System.out.println("#####Client3#####");
        Client3 client3 = new Client3();
        for (int i = 0; i < 5; i++) {
            client3.createAnimal();
        }
    }

    /*
     * #####Client1#####
     * 狗 吃 骨头
     * 狗 吃 骨头
     * 狗 吃 骨头
     * 狗 吃 骨头
     * 狗 吃 骨头
     * #####Client2#####
     * 猫 吃 鱼
     * 猫 吃 鱼
     * 猫 吃 鱼
     * 猫 吃 鱼
     * 猫 吃 鱼
     * #####Client3#####
     * 鸭 吃 大米
     * 鸭 吃 大米
     * 鸭 吃 大米
     * 鸭 吃 大米
     * 鸭 吃 鱼
     * 
     * 其中，animal和feed是有关联性的，比如鸭子不吃骨头，鸭子的工厂返回的饲料需要是鸭子可以吃的对象
     */

}

class Client1 {
    IAnimalFactory factory = new DogFactory();

    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        AbstractFeed feed = factory.createFeed();
        System.out.println(animal.getName() + " 吃 " + feed.getName());
    }

}

class Client2 {
    IAnimalFactory factory = new CatFactory();

    // 按序创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        AbstractFeed feed = factory.createFeed();
        System.out.println(animal.getName() + " 吃 " + feed.getName());
    }
}

class Client3 {
    IAnimalFactory factory = new DuckFactory();

    // 按序创建一个animal
    public void createAnimal() {
        AbstractAnimal animal = factory.createAnimal();
        AbstractFeed feed = factory.createFeed();
        System.out.println(animal.getName() + " 吃 " + feed.getName());
    }
}
