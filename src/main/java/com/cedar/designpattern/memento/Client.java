package com.cedar.designpattern.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("满血状态");
        System.out.println(originator);
        careTaker.add(originator.saveStateMemento());
        originator.setState("70%血");
        System.out.println(originator);
        careTaker.add(originator.saveStateMemento());
        originator.setState("30%血");
        System.out.println(originator);
        careTaker.add(originator.saveStateMemento());
        // 恢复
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator);
    }

}
