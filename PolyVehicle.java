class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car is moving smoothly on the road");
    }
}

class Bike extends Vehicle {
}

class PolyVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Polymorphism: Vehicle reference, Car object
        v1.move();                // Calls Car's move()

        Vehicle v2 = new Bike();  // Polymorphism: Vehicle reference, Bike object
        v2.move();                // Calls Bike's move()

        Vehicle v3 = new Vehicle(); // Direct object of Vehicle
        v3.move();                  // Calls Vehicle's move()
    }
}
