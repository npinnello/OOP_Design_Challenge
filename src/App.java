public class App {// Base Class (Inheritance)
    abstract class Vehicle {
        protected int speed;
        protected double fuelLevel;
    
        public Vehicle(int speed, double fuelLevel) {
            this.speed = speed;
            this.fuelLevel = fuelLevel;
        }
    
        public abstract void start(); // Abstract method (Polymorphism - Overriding)
    
        public void setSpeed(int speed) { // Data Coupling
            this.speed = speed;
        }
    
        public void refuel(double amount) { // Method Overloading (Polymorphism)
            this.fuelLevel += amount;
            System.out.println("Refueled: " + amount + " liters. Current fuel level: " + fuelLevel);
        }
    
        public void refuel(int percentage) { // Overloaded method
            this.fuelLevel += (this.fuelLevel * percentage) / 100;
            System.out.println("Refueled: " + percentage + "% of current fuel. New fuel level: " + fuelLevel);
        }
    }
    
    // Derived Class (Inheritance)
    class Car extends Vehicle {
        public Car(int speed, double fuelLevel) {
            super(speed, fuelLevel);
        }
    
        @Override
        public void start() { // Overriding (Polymorphism)
            System.out.println("Car is starting...");
        }
    
        public void updateVehicleStatus(VehicleStatus status) { // Stamp Coupling
            System.out.println("Car Status: " + status.getStatusMessage());
        }
    }
    
    // Derived Class (Inheritance)
    class Motorcycle extends Vehicle {
        public Motorcycle(int speed, double fuelLevel) {
            super(speed, fuelLevel);
        }
    
        @Override
        public void start() { // Overriding (Polymorphism)
            System.out.println("Motorcycle is starting...");
        }
    }
    
    // Interface Implementation
    interface ElectricVehicle {
        void chargeBattery();
    }
    
    // Electric Car implementing the interface
    class ElectricCar extends Vehicle implements ElectricVehicle {
        private int batteryLevel;
    
        public ElectricCar(int speed, double fuelLevel, int batteryLevel) {
            super(speed, fuelLevel);
            this.batteryLevel = batteryLevel;
        }
    
        @Override
        public void start() {
            System.out.println("Electric Car is starting...");
        }
    
        @Override
        public void chargeBattery() {
            this.batteryLevel = 100;
            System.out.println("Battery fully charged.");
        }
    }
    
    // Supporting Class for Stamp Coupling
    class VehicleStatus {
        private String statusMessage;
    
        public VehicleStatus(String statusMessage) {
            this.statusMessage = statusMessage;
        }
    
        public String getStatusMessage() {
            return statusMessage;
        }
    }
    
    // Main Class to Demonstrate Features
    public class VehicleManagementSystem {
        public static void main(String[] args) {
            App app = new App();
            Car myCar = app.new Car(100, 50);
            myCar.start();
            myCar.refuel(20);
            myCar.refuel(10);
            myCar.updateVehicleStatus(app.new VehicleStatus("Car is in good condition"));

            Motorcycle myMotorcycle = app.new Motorcycle(80, 15);
            myMotorcycle.start();

            ElectricCar myElectricCar = app.new ElectricCar(120, 0, 50);
            myElectricCar.start();
            myElectricCar.chargeBattery();
        }
    }
    
}
