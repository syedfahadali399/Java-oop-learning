package labsession8;

import labsession8.operation.*;
import labsession8.shapes.*;

public class task4 {
    public static void main(String[] args) {
        
        Calculators calculation = new Calculators(5, 7);

        Circles c1 = new Circles(4);

        System.out.println("the addition of number is " + calculation.calculateAddition());
        System.out.println("the addition of number is " + calculation.calculateSubtraction());

        System.out.println("The area of the circle is " + c1.caluclateArea());

    }
}
