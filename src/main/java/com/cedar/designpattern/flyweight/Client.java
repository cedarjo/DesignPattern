package com.cedar.designpattern.flyweight;

public class Client {

    public static void main(String[] args) {
        // 创建一个工厂类
        WebsiteFactory factory = new WebsiteFactory();
        // 客户要一个以新闻形式发布的网站
        Website website1 = factory.getWebsiteCategory("新闻");

        website1.use("Jack");

        // 客户要一个以博客形式发布的网站
        Website website2 = factory.getWebsiteCategory("博客");
        website2.use("Mick");

        Website website3 = factory.getWebsiteCategory("博客");
        website3.use("Lucy");

        System.out.println("网站的分类一共: " + factory.getWebsiteCount());
    }

}
