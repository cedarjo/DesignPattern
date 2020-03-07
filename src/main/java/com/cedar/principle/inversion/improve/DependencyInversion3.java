package com.cedar.principle.inversion.improve;

public class DependencyInversion3 {

    public static void main(String[] args) {
        ITV tv = new ITV() {

            @Override
            public void play() {
                System.out.println("TCL王牌彩电打开了");
            }
        };
        // 接口传递
        OpenAndClose1 openAndClose1 = new OpenAndClose1();
        openAndClose1.open(tv);

        // 构造方法传递
        OpenAndClose2 openAndClose2 = new OpenAndClose2(tv);
        openAndClose2.open();

        // setter方法传递
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(tv);
        openAndClose3.open();
    }

}

// 三种传递方式
interface ITV {
    void play();
}

// 1. 接口传递
interface IOpenAndClose1 {
    void open(ITV tv);
}

class OpenAndClose1 implements IOpenAndClose1 {

    @Override
    public void open(ITV tv) {
        tv.play();
    }

}

// 2. 构造方法传递
interface IOpenAndClose2 {
    void open();
}

class OpenAndClose2 implements IOpenAndClose2 {
    private ITV tv;

    public OpenAndClose2(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

// 3. setter方法传递
interface IOpenAndClose3 {
    void open();
}

class OpenAndClose3 implements IOpenAndClose3 {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}