// 1. Define the Interface
interface Switchable {
    // All methods in an interface are implicitly public and abstract (before Java 8)
    // or public static/default (Java 8+).
    // They define WHAT needs to be done, not HOW.
    void turnOn();
    void turnOff();
    boolean isSwitchedOn(); // Check current state
}

// 2. Implement the Interface in different classes
class Light implements Switchable {
    private boolean isOn = false;

    @Override // Implementing the turnOn method from Switchable interface
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light is ON. Let there be light!");
        } else {
            System.out.println("Light is already ON.");
        }
    }

    @Override // Implementing the turnOff method
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Light is OFF. It's dark now.");
        } else {
            System.out.println("Light is already OFF.");
        }
    }

    @Override // Implementing the isSwitchedOn method
    public boolean isSwitchedOn() {
        return isOn;
    }
}

class Fan implements Switchable {
    private boolean isRunning = false;
    private int speed = 0;

    @Override
    public void turnOn() {
        if (!isRunning) {
            isRunning = true;
            speed = 1; // Start at low speed
            System.out.println("Fan is ON at speed " + speed + ".");
        } else {
            System.out.println("Fan is already ON.");
        }
    }

    @Override
    public void turnOff() {
        if (isRunning) {
            isRunning = false;
            speed = 0;
            System.out.println("Fan is OFF.");
        } else {
            System.out.println("Fan is already OFF.");
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return isRunning;
    }

    // Fan-specific method (not from interface)
    public void increaseSpeed() {
        if (isRunning && speed < 3) {
            speed++;
            System.out.println("Fan speed increased to " + speed + ".");
        } else if (isRunning) {
            System.out.println("Fan is already at max speed.");
        } else {
            System.out.println("Turn on the fan first!");
        }
    }
}

// 3. Demonstrate the use of the interface
public class InterFaceDemo {
    public static void main(String[] args) {
        // We can declare references of the interface type
        Switchable device1 = new Light(); // Polymorphism: An object of Light (concrete type)
                                          // is referred to by an interface type Switchable.
        Switchable device2 = new Fan();   // An object of Fan (concrete type)
                                          // is referred to by an interface type Switchable.

        System.out.println("--- Operating Light ---");
        device1.turnOn();
        System.out.println("Is Light on? " + device1.isSwitchedOn());
        device1.turnOff();
        System.out.println("Is Light on? " + device1.isSwitchedOn());
        device1.turnOn(); // Turn on again
        System.out.println("\n");

        System.out.println("--- Operating Fan ---");
        device2.turnOn();
        System.out.println("Is Fan on? " + device2.isSwitchedOn());

        // We need to cast to Fan type to access Fan-specific methods
        if (device2 instanceof Fan) { // Check if it's actually a Fan object
            ((Fan) device2).increaseSpeed(); // Cast and call specific method
            ((Fan) device2).increaseSpeed();
            ((Fan) device2).increaseSpeed(); // Max speed
        }

        device2.turnOff();
        System.out.println("Is Fan on? " + device2.isSwitchedOn());
    }
}
