package labsession3;

class Rectangular {
    double length;
    double width;

    Rectangular() {
        length = 0;
        width = 0;

        rectangularInfo();
    }

    Rectangular(double length, double width) {
        this.length = length;
        this.width = width;

        if(length == 0 && width == 0) {
            width = 0;
            length = 0;
            System.out.println("Error due to negative number");
        }

        rectangularInfo();
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    boolean isSquare() {
        return length == width;
    }

    void rectangularInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());

        if(isSquare()) {
            System.out.println("This is a Square.");
        } else {
            System.out.println("This is not a Square.");
        }
    }
}

public class task5 {
    public static void main(String[] args) {

        Rectangular rectangular1 = new Rectangular();
        Rectangular rectangular2 = new Rectangular(3, 3);
        Rectangular rectangular3 = new Rectangular(0, 3);

        rectangular1.calculateArea();
        rectangular2.calculatePerimeter();
        rectangular3.rectangularInfo();
    }
}
