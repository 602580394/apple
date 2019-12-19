package com.google.shape;

//图形抽象
abstract class Shape {
    abstract void draw();
    abstract void erase();
}

public class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
    void erase() {
        System.out.println("Circle.erase()");
    }
}
public class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
    void erase() {
        System.out.println("Square.erase()");
    }
}
public class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
    void erase() {
        System.out.println("Triangle.erase()");
    }
}
public class Shape2 {
    public static void randShape() {
        //抽象类不能生成实例
        switch ((int)(Math.random()*3)) {
            //选择0抽象圆形
            case 0:
                Circle circle = new Circle();
                circle.draw();
                circle.erase();
                break;
            //选择1抽象正方形
                case 1:
                Square square = new Square();
                square.draw();
                square.erase();
                break;
            //选择2抽象三角形
                case 2:
                Triangle triangle = new Triangle();
                triangle.draw();
                triangle.erase();
                break;
        }
    }
    public static void main(String[] args) {
        randShape();
    }
}