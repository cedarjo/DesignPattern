package com.cedar.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    // 获取到第index个Originator的备忘录对象
    public Memento get(int index) {
        return mementos.get(index);
    }

}
