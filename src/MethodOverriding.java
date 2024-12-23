// Superclass
class Vehicle {
    // Method in the superclass
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    // Overriding the start method in the Car subclass
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// Subclass 2: Bike
class Bike extends Vehicle {
    // Overriding the start method in the Bike subclass
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating objects of the superclass and subclasses
        Vehicle myVehicle = new Vehicle();  // Object of superclass
        Vehicle myCar = new Car();          // Object of Car subclass
        Vehicle myBike = new Bike();        // Object of Bike subclass

        // Calling the start method on different objects
        myVehicle.start();  // Output: Vehicle is starting
        myCar.start();      // Output: Car is starting (Method Overriding)
        myBike.start();     // Output: Bike is starting (Method Overriding)
    }
}


