package labsession6;

class Box {
    int width;
    int height;
    int depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int calculateVolume() {
        int volume = width * height;
        return volume;
    }
}

class BoxWeight extends Box {
    int weight;

    BoxWeight(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    int calculateWeight() {
        int weight = depth * calculateVolume();
        return weight;
    }
}

class Shipment extends BoxWeight {
    int shippingCost;

    Shipment(int width, int height, int depth, int weight, int shippingCost) {
        super(width, height, depth, weight);
        this.shippingCost = shippingCost;
    }

    int calculateShippmentCost() {
        return shippingCost * calculateWeight();
    }
}
public class task3 {
    public static void main(String[] args) {
        
        Shipment calculateCost = new Shipment(2, 2, 3, 20, 50);
        
        System.out.println("The Volume of the box is " + calculateCost.calculateVolume());
        System.out.println("");
        System.out.println("The Weight of the box is " + calculateCost.calculateWeight() + "kg");
        System.out.println("");
        System.out.println("The Shipping Cost of the box is " + calculateCost.calculateShippmentCost() + "PKR");

    }
}