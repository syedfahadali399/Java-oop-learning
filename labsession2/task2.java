package labsession2;

public class task2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 100;  i+=2) {
            sum = sum + i;
        }

        System.out.println("The sum of all even number is " + sum);
    }
}

