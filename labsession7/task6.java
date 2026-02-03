package labsession7;

abstract class Appliance {
    String name;
    
    Appliance(String name) {
        this.name = name;
    }
    
    abstract void turnOn();
    abstract void turnOff();
    
    void displayStatus(String status) {
        System.out.println(name + ": " + status);
    }
}

class Fan extends Appliance {
    
    Fan(String name) {
        super(name);
    }
    
    @Override
    void turnOn() {
        displayStatus("Fan is now ON");
    }
    
    @Override
    void turnOff() {
        displayStatus("Fan is now OFF");
    }
}

class WashingMachine extends Appliance {
    
    WashingMachine(String name) {
        super(name);
    }
    
    @Override
    void turnOn() {
        displayStatus("Washing Machine is now ON");
    }
    
    @Override
    void turnOff() {
        displayStatus("Washing Machine is now OFF");
    }
    
    void startWashCycle() {
        displayStatus("Wash cycle started");
    }
    
    void stopWashCycle() {
        displayStatus("Wash cycle stopped");
    }
}

public class task6 {
    public static void main(String[] args) {
        
        Fan fan = new Fan("Ceiling Fan");
        fan.turnOn();
        fan.turnOff();
        
        System.out.println();
        
        WashingMachine washer = new WashingMachine("LG Washer");
        washer.turnOn();
        washer.startWashCycle();
        washer.stopWashCycle();
        washer.turnOff();
    }
}