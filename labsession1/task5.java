package labsession1;
public class task5 {
    public static void main(String[] args) {

        int num1 = 1;
        float num2 = 2;
        double num3 = 3;
        char singleWord = 3;
        String name = "Fahad";
        boolean value = true;

        System.out.printf("%d \n", num1);
        System.out.printf("%f \n", num2);
        System.out.printf("%f \n", num3);
        System.out.printf("%s \n", name);
        System.out.printf("%c \n", singleWord);
        System.out.printf("%b \n", value);

        double doubleValue = 9.78;
        int castToInt = (int) doubleValue;
        System.out.println("Casting double to int: " + castToInt);

        int intValue = 65;
        char castToChar = (char) intValue;
        System.out.println("Casting int to char: " + castToChar);

        char charValue = 'B';
        int castCharToInt = (int) charValue;
        System.out.println("Casting char to int: " + castCharToInt);

        String datatypeString = "123";

        int convertInt = Integer.parseInt(datatypeString);
        System.out.println(convertInt + 5);

        double convertDouble = Double.parseDouble(datatypeString);
        System.out.println(convertDouble + 7.00);

        int datatypeNumber = 123;
        String method1 = String.valueOf(datatypeNumber);
        System.out.println(method1);

    }
}
