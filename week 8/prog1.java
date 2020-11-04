import java.util.Scanner;

abstract class Shape{
    int b,h;
    Shape(int b, int h){
        this.b = b;
        this.h = h;
    }
    void printArea(){};
}

class Rectangle extends Shape{
    Rectangle(int b, int h){
        super(b,h);
    }

    void printArea() {
        System.out.println("Area of the rectangle is " + (b*h));
    };
}

class Triangle extends Shape{
    Triangle(int b, int h){
        super(b,h);
    }

    void printArea() {
        System.out.println("Area of the triangle is " + ((b*h)/2));
    };
}

class Circle extends Shape{
    Circle(int r){
        super(0,r);
    }

    void printArea() {
        System.out.println("Area of the cicle is " + (Math.PI*h*h));
    };
}

public class Prog1{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(10, 5);
        Circle c = new Circle(10);
        rect.printArea();
        tri.printArea();
        c.printArea();
    }
}