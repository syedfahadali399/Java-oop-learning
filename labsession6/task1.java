package labsession6;

class Vehicle {

    private String manufacture;
    private String model;
    protected int manufacturingYear;

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    Vehicle(String manufacture, String model, int manufacturingYear) {
        this.manufacture = manufacture;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public void displayDetail() {
        System.out.println("Manufacture " + manufacture + "\nModel " + model + "\nManufacturing Year " + manufacturingYear); 
    }

}

class Sedan extends Vehicle {

    private int numberOfDoor;

    Sedan(int numberOfDoor, Vehicle vehicle) {
        super(vehicle.getManufacture(), vehicle.getModel(), vehicle.manufacturingYear);
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    @Override
    public void displayDetail() {
        System.out.println("Manufactur: " + getManufacture() + "\nModel: " + getModel() + "\nManufacturing Year: " + manufacturingYear + "\nNumber of door: " + numberOfDoor); 

    }
}

class CargoTruck extends Vehicle {

    private int cargoCapacity;

    CargoTruck(int cargoCapacity, Vehicle vehicle) {
        super(vehicle.getManufacture(), vehicle.getModel(), vehicle.manufacturingYear);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void displayDetail() {
        System.out.println("Manufacture: " + getManufacture() + "\nModel: " + getModel() + "\nManufacturing Year: " + manufacturingYear + "\nCargo Capacity: " + cargoCapacity); 
    }
}

public class task1 {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("Honda", "Sedan", 2005);

        Vehicle vehicle2 = new Vehicle("Hinu", "Truck", 2000);

        Sedan corolla = new Sedan(4, vehicle1);
        corolla.displayDetail();

        System.out.println("");

        CargoTruck truck = new CargoTruck(400, vehicle2);
        truck.displayDetail();

    }
}