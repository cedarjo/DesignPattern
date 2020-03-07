package com.cedar.designpattern.facade;

public class Client {

    public static void main(String[] args) {
        // 直接调用会很麻烦
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.end();
    }

}
