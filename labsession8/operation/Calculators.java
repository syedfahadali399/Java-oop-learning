package labsession8.operation;

public class Calculators {
    
    int number1;
    int number2;
    
    public Calculators(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    } 

    public int calculateAddition() {
        int addition = number1 + number2;
        return addition;
    }

    public int calculateSubtraction() {
        int subtraction = number1 - number2;
        return subtraction;
    }

}
