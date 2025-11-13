package parkinglot.vehicle;

/**
 * BIKE EXTENDING VEHICLE
 */
public class Bike extends Vehicle {
    public Bike(String licenseNumber) {
        super(licenseNumber, VehicleSize.SMALL);
    }
}
