class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }
}

public class code2 {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.run();
        b.run();
    }
}
