package labsession5;

public class task3 {
    public static void main(String[] args) {

        String[] customers = {"John", "Alex", "john", "David", "ALex", "Sarah", "david"};

        System.out.println("Checking for Duplicate Customer Names");

        for (int i = 0; i < customers.length; i++) {
            for (int j = i + 1; j < customers.length; j++) {

                if (customers[i].equalsIgnoreCase(customers[j])) {
                    System.out.println("Duplicate found: " + customers[i] + " & " + customers[j]);
                }

            }
        }
    }
}
