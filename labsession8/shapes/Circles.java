package labsession8.shapes;

public class Circles {

    double pie = 3.14;
    int radius;
    
    public Circles(int radius) {
        this.radius = radius;
    }
    
    public double caluclateArea() {
        double area = pie * (radius * radius);
        return area;
    }

}
