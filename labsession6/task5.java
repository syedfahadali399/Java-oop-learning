package labsession6;

class Vehicle {

    String make;
    String model;
    int year;
    int insuranceCost;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    int calculateInsurance() {
        return insuranceCost;
    }
}

class Car extends Vehicle {

    int carPrice;
    int additionalInsurance;

    Car(String make, String model, int year, int carPrice) {
        super(make, model, year);
        this.insuranceCost = 4000;
        this.carPrice = carPrice;
        this.additionalInsurance = (carPrice / 100);
    }

    @Override
    int calculateInsurance() {
        return insuranceCost + additionalInsurance;
    }
}

class Motorcycle extends Vehicle {

    int motorcyclePrice;
    int additionalInsurance;

    Motorcycle(String make, String model, int year, int motorcyclePrice) {
        super(make, model, year);
        this.insuranceCost = 2000;
        this.motorcyclePrice = motorcyclePrice;
        this.additionalInsurance = (motorcyclePrice / 100) * 2;
    }

    @Override
    int calculateInsurance() {
        return insuranceCost + additionalInsurance;
    }
}

class Truck extends Vehicle {

    int truckWeight;
    int cargoPercentage;
    int additionalInsurance;

    Truck(String make, String model, int year, int truckWeight, int cargoPercentage) {
        super(make, model, year);
        this.insuranceCost = 6000;
        this.truckWeight = truckWeight;
        this.cargoPercentage = cargoPercentage;
        this.additionalInsurance = (truckWeight * cargoPercentage) / 100;
    }

    @Override
    int calculateInsurance() {
        return insuranceCost + additionalInsurance;
    }
}

public class task5 {
    public static void main(String[] args) {

        Car city = new Car("Toyota", "Sedan", 2005, 1600000);
        Motorcycle sp_100 = new Motorcycle("Super Power", "150cc", 2018, 250000);
        Truck ftr33_K = new Truck("Iszu", "None", 2000, 50000, 60);

        System.out.println("Car Insurance Fees: " + city.calculateInsurance() + " PKR");
        System.out.println("Bike Insurance Fees: " + sp_100.calculateInsurance() + " PKR");
        System.out.println("Truck Insurance Fees: " + ftr33_K.calculateInsurance() + " PKR");
    }
}