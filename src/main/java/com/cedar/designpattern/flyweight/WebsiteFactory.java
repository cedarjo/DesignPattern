package com.cedar.designpattern.flyweight;

import java.util.HashMap;

// 网站工厂类，根据需要返回一个网站
public class WebsiteFactory {

    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    // 根据网站类型，返回一个网站，如果没有就创建一个网站，并放入到池中
    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总数
    public int getWebsiteCount() {
        return pool.size();
    }
}
