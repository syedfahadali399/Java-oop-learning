package labsession7;

abstract class Shape {

    public abstract void calculateArea();

    double displayArea(double area) {
        return area;
    }
}

class Circle extends Shape {

    double area;
    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        area = pi * (radius * radius);
    }

}

class Rectangle extends Shape {

    double area;
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

}

public class task4 {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 10);

        System.out.println("The Area of circle is " + circle.displayArea(circle.area));
        System.out.println("The Area of rectangle is " + rectangle.displayArea(rectangle.area));

    }
}