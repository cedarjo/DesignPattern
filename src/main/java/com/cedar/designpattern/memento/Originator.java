package com.cedar.designpattern.memento;

import lombok.Data;

// 原始类
@Data
public class Originator {

    private String state;

    // 编写一个方法，可以保存一个状态对象 Memento
    // 因此编写一个方法，返回Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}
