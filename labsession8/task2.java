package labsession8;

interface SmartDevice {

    public void turnOff();

    public void turnOn();

}

class Light implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("\nThe Light is Onn!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Light is turn Off!");
    }
}

class ThermoStat implements SmartDevice {
    
    @Override
    public void turnOn() {
        System.out.println("\nThe ThermoStat is Onn!");
    }

    @Override
    public void turnOff() {
        System.out.println("The ThermoStat is turn Off!");
    }

}

class SecurityCamera implements SmartDevice {
    
    @Override
    public void turnOn() {
        System.out.println("\nThe SecurityCamera is Onn!");
    }

    @Override
    public void turnOff() {
        System.out.println("The SecurityCamera is turn Off!");
    }
}
public class task2 {
    public static void main(String[] args) {

        Light sonyLight = new Light();

        sonyLight.turnOn();
        sonyLight.turnOff();

        ThermoStat honeyWell = new ThermoStat();

        honeyWell.turnOn();
        honeyWell.turnOff();

        SecurityCamera camera = new SecurityCamera();

        camera.turnOn();
        camera.turnOff();
        
    }
}
