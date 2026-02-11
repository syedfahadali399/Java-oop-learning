package labsession9.Transport;

public class Truck implements Drivable, Loadable {
    private int capacity;
    private int currentLoad;

    public Truck(int capacity) {
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving with load " + currentLoad + " kg.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }

    @Override
    public void loadCargo(int weight) {
        if (currentLoad + weight <= capacity) {
            currentLoad += weight;
            System.out.println("Loaded " + weight + " kg. Current load: " + currentLoad + " kg.");
        } else {
            System.out.println("Cannot load " + weight + " kg. Exceeds capacity.");
        }
    }

    @Override
    public void unloadCargo() {
        System.out.println("Unloaded " + currentLoad + " kg.");
        currentLoad = 0;
    }

    public int getLoad() {
        return currentLoad;
    }
}
