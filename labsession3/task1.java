package labsession3;

class Cart {
    public String name;
    public double price;
    public int quantity;

    Cart(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return quantity * price;
    }

    void getItemDetail() {
        System.out.print("Product name " + name  + "\n");
        System.out.print("Product Price " + price + "\n");
        System.out.print("Product Quantity " + quantity + "\n");
    }

    void updatedQuantity(int newValue) {
        this.quantity = newValue;
    }
}

public class task1 {
    public static void main(String[] args) {
        Cart p1 = new Cart("water bottle", 800, 1);
        Cart p2 = new Cart("shampoo", 450, 1);

        p1.updatedQuantity(2);
        p1.getItemDetail();
        System.out.println("Your Total amount for this Product is " + p1.getTotalPrice() + "PKR");

        p2.updatedQuantity(3);
        p2.getItemDetail();
        System.out.println("Your Total amount for this product is " + p2.getTotalPrice() + "PKR");

    }
}