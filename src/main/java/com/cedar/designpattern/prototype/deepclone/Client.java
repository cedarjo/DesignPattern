package com.cedar.designpattern.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("方式1 - 深拷贝");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        System.out.println("sheep: " + sheep.hashCode());
        System.out.println("sheep2: " + sheep2.hashCode());
        System.out.println("sheep3: " + sheep3.hashCode());

        System.out.println("方式2 - 深拷贝");
        Sheep sheep4 = sheep.deepClone();
        Sheep sheep5 = sheep.deepClone();
        System.out.println("sheep: " + sheep.hashCode());
        System.out.println("sheep4: " + sheep4.hashCode());
        System.out.println("sheep5: " + sheep5.hashCode());
    }

}
