package labsession9;

import labsession9.Transport.*;

public class task3 {
    public static void main(String[] args) {

        Car car = new Car("Sedan", 4);
        car.drive();
        car.stop();
        car.honk();

        Bike bike = new Bike("Mountain", 2);
        bike.drive();
        bike.stop();
        bike.changeGear(3);

        Truck truck = new Truck(5000);
        truck.drive();
        truck.stop();
        truck.loadCargo(2000);
        truck.loadCargo(3500); // Should fail
        System.out.println("Current load: " + truck.getLoad());
        truck.unloadCargo();
    }
}
