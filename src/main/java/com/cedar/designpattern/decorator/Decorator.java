package com.cedar.designpattern.decorator;

public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 委派给构件
        this.component.operation();
    }

}
