# Vehicle Management System

## Overview
This project demonstrates core Object-Oriented Programming (OOP) concepts, including **Inheritance**, **Polymorphism**, **Interfaces**, and **Coupling**. The system models different types of vehicles (`Car`, `Motorcycle`, and `ElectricCar`) with an extensible and maintainable structure.

## Features
- **Inheritance**: `Car`, `Motorcycle`, and `ElectricCar` extend the `Vehicle` class.
- **Polymorphism**:
  - Method Overriding (`start()` method in `Car`, `Motorcycle`, and `ElectricCar`).
  - Method Overloading (`refuel()` method with different parameters).
- **Interfaces**: `ElectricVehicle` interface implemented by `ElectricCar`.
- **Coupling**:
  - **Data Coupling**: `setSpeed()` method modifies the `speed` attribute.
  - **Stamp Coupling**: `updateVehicleStatus(VehicleStatus status)` in `Car` class accepts an entire object.


## Usage
- Create instances of different vehicle types.
- Call methods to demonstrate polymorphism and inheritance.
- Modify and extend the project by adding new vehicle types.

## Example Usage
```java
Car myCar = new Car("Toyota", "Camry", 2022);
myCar.start();
myCar.refuel(10);
```



