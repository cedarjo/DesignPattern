package com.cedar.designpattern.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sheep implements Cloneable, Serializable {

    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    // 深拷贝 - 方式1 重写clone方法
    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (sheep.friend != null) {
            sheep.friend = sheep.friend.clone();
        }
        return sheep;
    }

    // 深拷贝 - 方式2 通过对象的序列化实现（推荐）
    public Sheep deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Sheep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
