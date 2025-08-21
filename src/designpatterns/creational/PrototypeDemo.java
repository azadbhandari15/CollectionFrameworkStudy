package designpatterns.creational;

public class PrototypeDemo {

    public static void main(String[] args) {
        Shape circleShape=new Circle();
        Shape rectangleShape=new Rectangle();

        Shape clonedCircle=circleShape.clone();
        Shape rectangleClone=rectangleShape.clone();
        clonedCircle.draw();
        rectangleClone.draw();
    }
}

interface Shape extends Cloneable{
    Shape clone();
    void draw();
}

 class Circle implements Shape{

    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle implements Shape{

    @Override
    public Shape clone() {
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}