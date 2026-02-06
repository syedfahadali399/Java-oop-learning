package labsession8;

interface Vehicle {

    public void startEngine();

    public void stopEngine();

}

class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car Engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Engine is stopped");
    }
}

class Bike implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bike Engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike Engine is stopped");
    }
}

public class task5 {
    public static void main(String[] args) {

        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.startEngine();
        myCar.stopEngine();

        myBike.startEngine();
        myBike.stopEngine();
    }
}
