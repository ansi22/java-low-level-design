package parkinglot.vehicle;

/**
 * TRUCK EXTENDING VEHICLE
 */
public class Truck extends Vehicle {
    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleSize.LARGE);
    }
}
