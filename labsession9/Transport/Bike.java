package labsession9.Transport;

public class Bike implements Drivable {
    private String type;
    private int gear;

    public Bike(String type, int gear) {
        this.type = type;
        this.gear = gear;
    }

    @Override
    public void drive() {
        System.out.println("Bike " + type + " is driving in gear " + gear + ".");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " has stopped.");
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Bike " + type + " changed to gear " + gear + ".");
    }
}
