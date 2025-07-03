class Car {
    void start() {
        System.out.println("Car is starting");
    }
}

class Audi extends Car {
    void drive() {
        System.out.println("Audi is driving smoothly");
    }
}

class singleinherit {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Audi audi = new Audi();
        audi.drive();
    }
}
