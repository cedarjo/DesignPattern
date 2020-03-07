package com.cedar.principle.ocp;

public class Ocp1 {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawCircle(new Circle());
    }

}

// Shape类，基类
class Shape {
    int m_type;
}

// 这是一个用于绘图的类
class GraphicEditor {
    // 接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
        // 需要新增代码
        else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    // 需要新增代码
    public void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

// 方式1的优缺点
// 1. 优点是比较好理解，简单易操作
// 2. 缺点是违反了设计模式的ocp原则，即对扩展开放（提供方），对修改关闭（使用方）。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码。
// 3. 比如我们这时候要新增加一个图形种类，我们需要做如下修改，修改的地方较多
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}

// 方式1的改进思路分析
// 思路：把创建Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可，使用方的代码就不需要修改（满足了开闭原则）
