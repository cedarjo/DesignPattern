package com.cedar.principle.ocp.improve;

public class Ocp2 {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

// Shape类，基类
abstract class Shape {
    int m_type;

    abstract void draw(); // 抽象方法
}

// 这是一个用于绘图的类
class GraphicEditor {
    // 接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }

}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增三角形时
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}

// 这里的m_type就不需要了
