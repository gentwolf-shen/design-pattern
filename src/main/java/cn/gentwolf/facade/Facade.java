package cn.gentwolf.facade;

public class Facade {
}


interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}

class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.square = new Square();
        this.circle = new Circle();
    }

    public void drawRetangle() {
        this.rectangle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }

    public void drawCircle() {
        this.circle.draw();
    }
}