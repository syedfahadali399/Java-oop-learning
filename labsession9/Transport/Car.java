package labsession9.Transport;

public class Car implements Drivable {
    private String type;
    private int gear;

    public Car(String type, int gear) {
        this.type = type;
        this.gear = gear;
    }

    @Override
    public void drive() {
        System.out.println("Car " + type + " is driving in gear " + gear + ".");
    }

    @Override
    public void stop() {
        System.out.println("Car " + type + " has stopped.");
    }

    public void honk() {
        System.out.println("Car is hooking");
    }
}

