package com.cedar.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("#############");
        component = new ConcreteDecoratorA(component);
        component.operation();
        System.out.println("#############");
        component = new ConcreteDecoratorB(component);
        component.operation();
    }

}
